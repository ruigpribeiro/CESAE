<?php

namespace App\Http\Controllers;

use App\Models\Gift;
use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class GiftController extends Controller
{
    // Mostrar todas as prendas
    public function index(Request $request)
    {
        $query = DB::table('gifts')
            ->join('users', 'gifts.user_id', '=', 'users.id')
            ->select('gifts.*', 'users.name as user_name');

        if ($request->search) {
            $query->where('users.name', 'like', "%{$request->search}%");
        }

        $gifts = $query->get();

        return view('gifts.show_gifts', compact('gifts'));
    }

    // Mostrar o formulário de criação de uma nova prenda
    public function create()
    {
        $users = User::all();
        return view('gifts.create_gift', compact('users'));
    }

    // Inserir uma nova prenda
    public function store(Request $request)
    {
        $request->validate([
            'name' => 'required|string|max:255',
            'estimated_value' => 'required|numeric',
            'user_id' => 'required|exists:users,id',
        ]);

        Gift::create($request->all());

        return redirect()->route('gifts.show')->with('message', 'Prenda adicionada com sucesso!');
    }

    public function edit($id)
    {
        $gift = Gift::findOrFail($id);

        return view('gifts.edit_gift', compact('gift'));
    }


    // Atualizar o valor gasto de uma prenda
    public function update(Request $request, Gift $gift)
    {
        $request->validate([
            'spent_value' => 'nullable|numeric',
        ]);

        $gift->update($request->only('spent_value'));

        return redirect()->route('gifts.show')->with('message', 'Valor gasto atualizado!');
    }

    // Apagar uma prenda
    public function delete(Gift $gift)
    {
        $gift->delete();

        return redirect()->route('gifts.show')->with('message', 'Prenda removida com sucesso!');
    }
}
