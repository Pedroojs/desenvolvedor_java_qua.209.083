package com.encapsulamento.app;

import com.encapsulamento.models.Pessoa;


public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa usuario = new Pessoa();

        usuario.setNome("Pedro");
        usuario.setCpf("123.456.721-89");
        usuario.setEmail("Pedro@gmail.com");
        usuario.setIdade(20);
        
    }
}
