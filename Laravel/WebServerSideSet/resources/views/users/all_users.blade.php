@extends('layouts.main_layout')

@section('content')
    <h2>Aqui vai estar uma lista de todos os usuários</h2>

    @if(session('message'))
    <div class="alert alert-success">
        {{session('message')}}
    </div>
    @endif

    <form action="">
        <input type="text" placeholder="Search" name="search">
        <button type="submit" class="btn btn-info">Search</button>
    </form>

    <table class="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Email</th>
            <th scope="col">Password</th>
            <th></th>
            <th></th>
          </tr>
        </thead>
        <tbody>
        @foreach ($users as $user)
          <tr>
            <th scope="row">{{$user->id}}</th>
            <td>{{$user->name}}</td>
            <td>{{$user->email}}</td>
            <td>{{$user->password}}</td>
            <td><a href="{{route('users.view', $user->id)}}" class="btn btn-info">Ver/Editar</a></td>
            <td><a href="{{route('users.delete', $user->id)}}" class="btn btn-danger">Apagar</a></td>
        </tr>
        @endforeach
        </tbody>
      </table>

@endsection
