package com.atividade_03.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome:");
        String nome = scan.nextLine();

        System.out.println("Informe o peso em kg:");
        double peso = scan.nextDouble();

        System.out.println("Informe a altura em metros:");
        double altura = scan.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("Olá %s! Seu IMC é: %.2f%n", nome, imc);

        // Classificação do IMC
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade grau II";
        } else {
            classificacao = "Obesidade grau III (mórbida)";
        }
        

        System.out.println("Classificação: " + classificacao);

        scan.close();
    }
}
