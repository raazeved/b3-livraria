package tech.ada.poo.base.biblioteca.model;

import java.util.ArrayList;

public class Autor {
    private String nome;
    private String cpf;
    private ArrayList<Livro> Livro;

    public Autor(String nome, String cpf, ArrayList<Livro> Livro) {
        this.nome = nome;
        this.cpf = cpf;
        this.Livro = Livro;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public ArrayList<Livro> getLivro() {
        return this.Livro;
    }
}
