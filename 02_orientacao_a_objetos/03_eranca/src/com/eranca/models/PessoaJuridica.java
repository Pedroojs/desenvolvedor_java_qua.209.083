package com.eranca.models;

public class PessoaJuridica extends Pessoa{
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;


    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String email, String telefone) {
        super(email, telefone);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }


}
