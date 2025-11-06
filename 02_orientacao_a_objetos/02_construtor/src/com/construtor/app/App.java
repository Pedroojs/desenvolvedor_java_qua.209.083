package com.construtor.app;

import java.util.Scanner;
import com.construtor.modules.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa("", "", "", "", 0);

        System.out.println("Informe seu nome:");
        usuario.nome = leia.nextLine();
        System.out.println("Informe seu CPF:");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe o seu E-mail:");
        usuario.email = leia.nextLine();
        System.out.println("Informe o seu Telefone:");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe a sua idade:");
        usuario.idade = leia.nextInt();

        usuario.aprensentar();
        
        leia.close();
    }
}
