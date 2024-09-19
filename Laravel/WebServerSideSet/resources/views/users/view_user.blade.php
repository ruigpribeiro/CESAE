@extends('layouts.main_layout')

@section('content')
<form method="POST" action="{{route('user.create')}}">
    @csrf
    <input type="hidden" name="id" value="{{$user->id}}" id="">
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Name</label>
        <input type="text" value="{{$user->name}}" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >
        @error('name')
            Name inválido
        @enderror
    </div>
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Email address</label>
        <input disabled type="email" name="email" value="{{$user->email}}" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >
        @error('email')
            Email inválido
        @enderror
    </div>
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Address</label>
        <input type="text" name="address" value="{{$user->address}}" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >
        @error('address')
            Morada inválida
        @enderror
    </div>
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Phone</label>
        <input type="text" name="phone" value="{{$user->phone}}" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" >
        @error('address')
            Telemovel inválida
        @enderror
    </div>
      <button type="submit" class="btn btn-primary">Update</button>
</form>
@endsection

