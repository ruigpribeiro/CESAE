@extends('layouts.main_layout')
@section('content')

<table class="table">
    <thead>
      <tr>
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">Description</th>
        <th scope="col">User Id</th>
      </tr>
    </thead>
    <tbody>
    @foreach ($tasks as $task)
      <tr>
        <th scope="row">{{$task -> id}}</th>
        <td>{{$task -> name}}</td>
        <td>{{$task -> description}}</td>
        <td>{{$task -> user_name}}</td>
        <td><a href="{{route('tasks.view', $task->id)}}" class="btn btn-info">Ver/Editar</a></td>
        <td><a href="{{route('tasks.delete', $task->id)}}" class="btn btn-danger">Apagar</a></td>
      </tr>
      @endforeach
    </tbody>
  </table>

@endsection
