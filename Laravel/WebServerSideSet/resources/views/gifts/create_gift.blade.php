@extends('layouts.main_layout')

@section('content')
<div class="container">
    <h1>Adicionar Nova Prenda</h1>

    @if (session('message'))
        <div class="alert alert-success">{{ session('message') }}</div>
    @endif

    <form action="{{ route('gifts.store') }}" method="POST">
        @csrf

        <div class="mb-3">
            <label for="name" class="form-label">Nome da Prenda</label>
            <input type="text" class="form-control" id="name" name="name" required>
        </div>

        <div class="mb-3">
            <label for="estimated_value" class="form-label">Valor Previsto</label>
            <input type="number" step="0.01" class="form-control" id="" name="estimated_value" required>
        </div>

        <div class="mb-3">
            <label for="user_id" class="form-label">Selecionar Pessoa</label>
            <select class="form-select" id="" name="user_id" required>
                <option value="">Escolha um utilizador</option>
                @foreach ($users as $user)
                    <option value="{{ $user->id }}">{{ $user->name }}</option>
                @endforeach
            </select>
        </div>

        <button type="submit" class="btn btn-primary">Adicionar Prenda</button>
        <a href="{{ route('gifts.show') }}" class="btn btn-secondary">Cancelar</a>
    </form>
</div>
@endsection
