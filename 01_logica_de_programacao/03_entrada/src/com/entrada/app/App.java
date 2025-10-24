package com.entrada.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instancia do objeto reader
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite seu nome:");

        // entrada
        String nome = reader.nextLine();
        System.out.println("digite a sua idade:");

        // entrada
        short idade = reader.nextShort();

        reader.nextLine();

        System.out.println("digite o seu email:");

        String email = reader.nextLine();

        System.out.println("-----------------------------------");
        System.out.println("Informações do usuário");
        System.out.println("-----------------------------------");

        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        if (email.endsWith("@gmail.com")) {
            System.out.println("email: " + email);
        } else {
            System.out.println("email inválido!");
        }

        reader.close();
    }
}
