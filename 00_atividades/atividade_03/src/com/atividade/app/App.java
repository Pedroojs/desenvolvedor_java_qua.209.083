package com.atividade.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int op = 0;

        System.out.println("Digite seu nome:");
        //String nome = scan.nextLine();
        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();

 
        do {
            System.out.println("\nEscolha uma sala:");
            System.out.println("Sala 1 - A Roda Quadrada - Livre");
            System.out.println("Sala 2 - A Volta dos Que Não Foram - 12 anos");
            System.out.println("Sala 3 - Poeira em Alto Mar - 14 anos");
            System.out.println("Sala 4 - As Tranças do Rei Careca - 16 anos");
            System.out.println("Sala 5 - A Vingança do Peixe Frito - 18 anos");
            System.out.println("6 - Sair");

            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Imprimindo ingresso para a Sala 1...");
                    break; 
                case 2:
                    if (idade >= 12) {
                        System.out.println("Imprimindo ingresso para a Sala 2...");
                        break; 
                    } else {
                        System.out.println("Entrada bloqueada. Tente outro filme!");
                    }
                    break;
                case 3:
                    if (idade >= 14) {
                        System.out.println("Imprimindo ingresso para a Sala 3...");
                        break; 
                    } else {
                        System.out.println("Entrada bloqueada. Tente outro filme!");
                    }
                    break;
                case 4:
                    if (idade >= 16) {
                        System.out.println("Imprimindo ingresso para a Sala 4...");
                        break; 
                    } else {
                        System.out.println("Entrada bloqueada. Tente outro filme!");
                    }
                    break;
                case 5:
                    if (idade >= 18) {
                        System.out.println("Imprimindo ingresso para a Sala 5...");
                        break; 
                    } else {
                        System.out.println("Entrada bloqueada. Tente outro filme!");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            
            if (op >= 1 && op <= 5 && (idade >= 12 || op == 1)) {
                break;  
            }

        } while (op != 6); 

        scan.close(); 
    }
}
