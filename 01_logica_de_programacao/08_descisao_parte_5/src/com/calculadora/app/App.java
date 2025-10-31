package com.calculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor de x: ");
        double x = scan.nextDouble();
        System.out.print("Informe o valor de y: ");
        double y = scan.nextDouble();
        scan.nextLine(); // limpar buffer

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        String operador = scan.nextLine();

        double resultado;
        boolean valido = true;

        switch (operador) {
            case "1" -> resultado = x + y;
            case "2" -> resultado = x - y;
            case "3" -> resultado = x * y;
            case "4" -> resultado = (y != 0) ? x / y : Double.NaN;
            default -> {
                valido = false;
                resultado = 0;
            }
        }

        if (valido) {
            if (operador.equals("4") && y == 0) {
                System.out.println("Erro: Divisão por zero!");
            } else {
                System.out.println("Resultado: " + resultado);
            }
        } else {
            System.out.println("Operação inválida!");
        }

        scan.close();
    }
}
