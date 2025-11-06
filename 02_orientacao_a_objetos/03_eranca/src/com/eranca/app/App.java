package com.eranca.app;

import com.eranca.models.PessoaFisica;
import com.eranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        System.out.println("\n===========================");
        System.out.println("Pessoa Fisica");
        System.out.println("===========================");

        usuario.setEmail("pedro@gmail.com");
        usuario.setTelefone("(61) 98765-4321");
        usuario.setNome("Pedro");
        usuario.setIdade(20);
        usuario.setCpf("12345678");

        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Telefone: " + usuario.getTelefone());
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("CPF: " + usuario.getCpf());

        System.out.println("===========================");
        System.out.println("Pessoa Juridica");
        System.out.println("===========================");

        empresa.setEmail("leitada@gmail.com");
        empresa.setTelefone("03030303030303");
        empresa.setNomeFantasia("Toma Leitada");
        empresa.setRazaoSocial("Toma LEITDA");
        empresa.setCnpj("12345678/0001-69");

        System.out.println("E-mail: " + empresa.getEmail());
        System.out.println("Telefone: " + empresa.getTelefone());
        System.out.println("Nome: " + empresa.getNomeFantasia());
        System.out.println("Idade: " + empresa.getRazaoSocial());
        System.out.println("CPF: " + empresa.getCnpj());
        System.out.println("\n");
    }
}
