<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Console\View\Components\Task;

class TaskController extends Controller
{
    public function allTasks() {
        $tasks = $this->getAllTasks();

        return view('tasks.all_tasks', compact('tasks'));
    }

    protected function getAllTasks() {
        $tasks = DB::table('tasks')
        ->join('users', 'users.id', '=', 'tasks.user_id')
        ->select('tasks.*', 'users.name as user_name')
        ->get();

        return $tasks;
    }

    public function viewTask($id) {
        $task = DB::table('tasks')
        ->where('tasks.id', $id)
        ->join('users', 'users.id', '=', 'tasks.user_id')
        ->select('tasks.*', 'users.name as user_name')
        ->first();

        return view('tasks.view_task', compact('task'));
    }

    public function deleteTask($id) {
        $task = DB::table('tasks')
        ->where('id', $id)
        ->delete();

        return back();
    }

    public function addTask() {
        $users = DB::table('users')
        ->get();
        
        return view('tasks.add_task', compact('users'));
    }

    public function createTask(Request $request) {

        $request->validate([
            'name' => 'string|max:50',
            'description' => 'string|max:255',
            'user_id' => 'integer|required'
        ]);

        DB::table('tasks')
        ->insert([
            'name' => $request->name,
            'description'=> $request->description,
            'user_id' => $request->user_id
        ]);

        return redirect() -> route('tasks.all')->with('message', 'Tarefa adicionada com sucesso!');

    }

}
