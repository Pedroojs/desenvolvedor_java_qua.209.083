package com.eranca.app;

import java.util.Scanner;

import com.eranca.models.PessoaFisica;
import com.eranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null,   null, 0, null, null);
        leia.close();
    }
}  
