<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;

class UserController extends Controller
{
    public function addUser() {
        /*
        DB::table('users')
        ->insert([
            'name' => 'Sara',
            'email' => 'sara@cesae.pt',
            'password' => '1234'
        ]);
        */

        /*
        DB::table('tasks')
        ->where('id', 2)
        ->update([
            'description' => 'operações à base de dados;']
        );
        */

        return view('users.add_user');
    }

    public function createUser(Request $request) {

        $action = '';

        // update
        if(isset($request->id)) {
            $action = 'atualizado';

            $request->validate([
                'name' => 'required|string|max:50'
            ]);

            User::where('id', $request->id)
            ->update([
                'name'=> $request->name,
                'phone'=> $request->phone,
                'address'=> $request->address
            ]);

        } else { // insert
            $action = 'adicionado';

             $request->validate([
            'name' => 'string|max:50',
            'email' => 'required|email|unique:users',
            'password' => 'min:6'
            ]);

            User::insert([
            'name' => $request->name,
            'email' => $request->email,
            'password' => Hash::make($request->password)
            ]);
        }

        dd($request->all());

        return redirect() -> route('users.all')->with('message', 'Utilizador foi ' .$action . ' com sucesso!');

        //dd('stopppp');
    }

    public function allUsers() {

        $search = isset(request()->search) ? request()->search : null;

        $users = $this->getUsers($search);

        return view('users.all_users', compact('users'));
    }

    protected function getUsers($search) {

        if ($search) {
            $users = User::where('name', 'like', "{$search}%")->get();
        } else {
            $users = User::all();
        }

        return $users;
    }

    public function viewUser($id) {
        $user = DB::table('users')
        ->where('id', $id)
        ->first();

        return view('users.view_user', compact('user'));
    }

    public function deleteUser($id) {
        DB::table('tasks')
        ->where('user_id', $id)
        ->delete();

        $user = DB::table('users')
        ->where('id', $id)
        ->delete();

        return back();
    }

}
