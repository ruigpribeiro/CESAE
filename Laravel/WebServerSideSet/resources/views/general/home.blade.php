<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="{{asset('css/style.css')}}">
</head>
<body>

@extends('layouts.main_layout')

@section('content')

    <h4>{{$welcome}}</h4>
    <h4>Olá, {{$name}}</h4>

    <h2>Cursos:</h2>
    <ul>
        @foreach ($cesaeInfo as $item)
        <li>{{$item}}</li>
        @endforeach
    </ul>

    <img src="{{asset('images/assessment.jpg')}}" alt="">

    <u>
        <li><a href="{{route('route.welcome')}}">Bem vindo</a></li>
        <li><a href="{{route('users.add')}}">Adicionar Utilizador</a></li>
        <li><a href="{{route('users.all')}}">Mostrar Utilizadores</a></li>
        <br>
        <li><a href="{{route('task.add')}}">Adicionar Tarefa</a></li>
        <li><a href="{{route('tasks.all')}}">Mostrar Tarefas</a></li>
        <br>
        <li><a href="{{route('gifts.store')}}">Adicionar Prenda</a></li>
        <li><a href="{{route('gifts.show')}}">Mostrar Prendas</a></li>
    </u>

    <br>

    <p>O {{$cesaeInfos['name']}} fica na {{$cesaeInfos['address']}} com o email {{$cesaeInfos['email']}}</p>

    <table>
        <tbody>
                @foreach ($contactInfo as $item)
                <tr>
                    <td>{{ $item['id'] }}</td>
                    <td>{{ $item['name'] }}</td>
                    <td>{{ $item['phone'] }}</td>
                </tr>
                @endforeach
            </tbody>
    </table>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
@endsection

</body>
</html>
