<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Gift extends Model
{
    use HasFactory;

    // Definir os campos que podem ser preenchidos
    protected $fillable = [
        'name',
        'estimated_value',
        'spent_value',
        'user_id'
    ];

    // Definir o relacionamento com o utilizador
    public function user()
    {
        return $this->belongsTo(User::class);
    }
}
