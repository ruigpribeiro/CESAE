@extends('layouts.main_layout')
@section('content')

<h1>Olá, aqui podes adicionar tarefas.</h1>
<form method="POST" action="{{route('task.create')}}">
    @csrf
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Name</label>
        <input type="text" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required>
        @error('name')
        Nome inválido
        @enderror
    </div>
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Description</label>
        <input type="text" name="description" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required>
        @error('description')
        Descrição inválido
        @enderror
    </div>
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">User</label>

        <select name="user_id" id="">
            @foreach ($users as $user)
                <option value="{{$user->id}}">{{$user->name}}</option>
            @endforeach
        </select>

        @error('email')
        User Id inválido
        @enderror
    </div>
      <button type="submit" class="btn btn-primary">Submit</button>
</form>

@endsection
