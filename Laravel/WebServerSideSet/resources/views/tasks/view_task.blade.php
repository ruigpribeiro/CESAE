@extends('layouts.main_layout')

@section('content')
    <h1>Name: {{$task->name}}</h1>
    <h5>Description: {{$task->description}}</h5>
    <h5>Due at: {{$task->due_at}}</h5>
    <h5>Status: {{$task->status}}</h5>
    <h5>User id: {{$task->user_name}}</h5>
@endsection
