package com.media.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // instancia do scanner
        Scanner scan = new Scanner(System.in);

        // entrada de dados
        System.out.println("Informe o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Informe a nota de 0 a 10: ");
        double nota = scan.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Informe um valor entre 0 e 10.");
            scan.close();
            return;
        }

        String status = (nota >= 7) ? "Aprovado"
                        : (nota >= 5) ? "de Recuperação.."
                        : "Reprovado";

        System.out.printf("%s está %s.%n", nome, status);

        // fecha o objeto scan
        scan.close();
    }
}
