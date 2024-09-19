@extends('layouts.main_layout')

@section('content')
<div class="container">
    <h1>Editar Prenda</h1>

    @if (session('message'))
        <div class="alert alert-success">{{ session('message') }}</div>
    @endif

    <form action="{{ route('gifts.update', $gift->id) }}" method="POST">
        @csrf
        @method('PUT')

        <div class="mb-3">
            <label for="name" class="form-label">Nome da Prenda:</label>
            <input type="text" class="form-control" name="name" value="{{ $gift->name }}" disabled>
        </div>

        <div class="mb-3">
            <label for="estimated_value" class="form-label">Valor Previsto:</label>
            <input type="text" class="form-control" name="estimated_value" value="{{ $gift->estimated_value }}" disabled>
        </div>

        <div class="mb-3">
            <label for="spent_value" class="form-label">Valor Gasto:</label>
            <input type="number" step="0.01" class="form-control" name="spent_value" value="{{ old('spent_value', $gift->spent_value) }}">
        </div>

        <button class="btn btn-info" type="submit">Guardar</button>
        <a href="{{ route('gifts.show') }}" class="btn btn-secondary">Voltar à Lista de Prendas</a>
    </form>
</div>
@endsection
