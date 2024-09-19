@extends('layouts.main_layout')

@section('content')
<div class="container">
    <h1>Gestão de Prendas</h1>

    <a href="{{ route('gifts.create') }}" class="btn btn-success mb-3">Adicionar Nova Prenda</a>

    @if (session('message'))
        <div class="alert alert-success">{{ session('message') }}</div>
    @endif

    <table class="table">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Nome da Prenda</th>
                <th scope="col">Valor Previsto</th>
                <th scope="col">Valor Gasto</th>
                <th scope="col">Pessoa</th>
                <th scope="col"></th>
                <th scope="col"></th>
            </tr>
        </thead>
        <tbody>
            @foreach ($gifts as $gift)
                <tr>
                    <th scope="row">{{ $gift->id }}</th>
                    <td>{{ $gift->name }}</td>
                    <td>{{ $gift->estimated_value }}</td>
                    <td>{{ $gift->spent_value ?? 'Não informado' }}</td>
                    <td>{{ $gift->user_name }}</td>
                    <td>
                        <a href="{{ route('gifts.edit', $gift->id) }}" class="btn btn-info">Editar</a>
                    </td>
                    <td>
                        <form action="{{ route('gifts.delete', $gift->id) }}" method="POST">
                            @csrf
                            @method('DELETE')
                            <button type="submit" class="btn btn-danger">Apagar</button>
                        </form>
                    </td>
                </tr>
            @endforeach
        </tbody>
    </table>
</div>
@endsection
