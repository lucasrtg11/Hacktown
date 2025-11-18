package com.eventos.demo.model;

public class Palestrante {
    private String nome;
    private String tema;
    private String telefone;
    private String email;

    public Palestrante() {
    }

    public Palestrante(String nome, String tema) {
        this.nome = nome;
        this.tema = tema;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTema() {
        return tema;
    }

    public void settema(String tema) {
        this.tema = tema;
    }

    public String getTelefone() {
        return telefone;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
}
