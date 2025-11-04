package com.atividade01.app;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
       

        Scanner scan = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = scan.nextLine();

        System.out.println("Data de nascimento (dd/mm/aaaa):");
        String dataNascimento = scan.nextLine(); 

        System.out.println("CPF (apenas números):");
        String cpf = scan.nextLine();  

        System.out.println("E-mail:");
        String email = scan.nextLine();

        System.out.println("Telefone (apenas números):");
        String telefone = scan.nextLine();  

        System.out.println("==========================");
        System.out.println("Informações do usuário:");
        System.out.println("==========================");

        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);

        scan.close();
    }
}
