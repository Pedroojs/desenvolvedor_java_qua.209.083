package com.lista.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[5];

        for(int i = 0; i < nomes.length; i++){
                System.out.println("Informe o " + (i + 1) + "º nome: ");
                nomes[i] = scan.nextLine();
        }
        
        System.out.println("====================");
        System.out.println("Nomes digitados:");
        System.out.println("====================");
        
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        scan.close();
    }
}
