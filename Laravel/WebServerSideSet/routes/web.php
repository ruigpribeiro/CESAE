<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\TaskController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\IndexController;
use App\Http\Controllers\GiftController;

// Home

Route::get('/', function () {
    return view('welcome');
}) -> name('route.welcome');

Route::get('/home', [IndexController::Class, 'home']) -> name('route.home');


// Users
Route::get('/adduser', [UserController::class, 'addUser'])->name('users.add');

Route::post('/adduser', [UserController::class, 'createUser']) -> name ('user.create');

Route::get('/allusers', [UserController:: class, 'allUsers']) -> name ('users.all');

Route::get("/viewuser/{id}", [UserController::class, 'viewUser']) -> name ('users.view');

Route::get("/deleteuser/{id}", [UserController::class, 'deleteUser']) -> name ('users.delete');


// Tasks
Route::post('/addtask', [TaskController::class, 'createTask']) -> name ('task.create');

Route::get('/addTask', [TaskController::class, 'addTask']) -> name('task.add');

Route::get('/alltasks', [TaskController::class, 'allTasks']) -> name ('tasks.all');

Route::get("/viewtask/{id}", [TaskController::class, 'viewTask']) -> name ('tasks.view');

Route::get("/deletetask/{id}", [TaskController::class, 'deleteTask']) -> name ('tasks.delete');


// Gifts
Route::get('/gifts', [GiftController::class, 'index'])->name('gifts.show');

Route::get('/gifts/create', [GiftController::class, 'create'])->name('gifts.create');

Route::post('/gifts', [GiftController::class, 'store'])->name('gifts.store');

Route::get('/gifts/{gift}/edit', [GiftController::class, 'edit'])->name('gifts.edit');

Route::put('/gifts/{gift}', [GiftController::class, 'update'])->name('gifts.update');

Route::delete('/gifts/{gift}', [GiftController::class, 'delete'])->name('gifts.delete');


// Fallback
Route::fallback(function() {
    return view('fallback');
});

