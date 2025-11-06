package com.construtor.modules;

public class Pessoa {
    //atributos

    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public int idade;

    public Pessoa(String nome, String cpf, String email, String telefone, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
    }

    public void aprensentar(){
        System.out.println("Olá, Meu nome é "+this.nome+", e tenho "+this.idade+" anos. Meu E-mail é "+this.email+", meu telefone é "+this.telefone+" e meu CPF é "+this.cpf+".");
    } 

}
