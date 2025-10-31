package com.calculadora.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro(scan, "Escolha uma opção: ");

            if (opcao >= 1 && opcao <= 6) {
                double x = lerDouble(scan, "Digite o valor de x: ");
                double y = lerDouble(scan, "Digite o valor de y: ");
                double resultado = calcular(opcao, x, y);

                if (!Double.isNaN(resultado)) {
                    System.out.println("\nResultado: " + resultado);
                }
            } else if (opcao == 7) {
                System.out.println("\nEncerrando o programa...");
            } else {
                System.out.println("\nOpção inválida! Tente novamente.");
            }

        } while (opcao != 7);

        scan.close();
    }

    // ---------- Métodos auxiliares ----------

    private static void exibirMenu() {
        System.out.println("\n========= CALCULADORA =========");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Resto da divisão");
        System.out.println("6 - Potência");
        System.out.println("7 - Sair");
        System.out.println("================================");
    }

    private static int lerInteiro(Scanner scan, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro!");
                scan.nextLine(); // limpa o buffer
            }
        }
    }

    private static double lerDouble(Scanner scan, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido!");
                scan.nextLine();
            }
        }
    }

    private static double calcular(int opcao, double x, double y) {
        return switch (opcao) {
            case 1 -> x + y;
            case 2 -> x - y;
            case 3 -> x * y;
            case 4 -> {
                if (y == 0) {
                    System.out.println("Erro: divisão por zero!");
                    yield Double.NaN;
                }
                yield x / y;
            }
            case 5 -> {
                if (y == 0) {
                    System.out.println("Erro: divisão por zero!");
                    yield Double.NaN;
                }
                yield x % y;
            }
            case 6 -> Math.pow(x, y);
            default -> Double.NaN;
        };
    }
}
