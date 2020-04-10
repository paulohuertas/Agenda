package com.example.agenda.model;

import androidx.annotation.NonNull;

public class Aluno {
    private final String nome;
    private final String telefone;
    private final String email;

    public Aluno(String nome, String telefone, String Email) {
        this.nome = nome;
        this.telefone = telefone;
        email = Email;
    }

    @NonNull
    @Override
    public String toString(){
        return nome;
    }
}
