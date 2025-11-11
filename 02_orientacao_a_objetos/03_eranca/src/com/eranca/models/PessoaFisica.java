package com.eranca.models;

public class PessoaFisica extends Pessoa {
    private String nome;
    private String cpf;
    private int idade;


    public PessoaFisica(String nome, String cpf, int idade, String email, String telefone) {
        super(email, telefone);
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
   

}
