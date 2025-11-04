package com.atividade.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //calcula a equação do primeiro grau: ax+b = 0

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de a: ");
        double a = scan.nextDouble();
        System.out.println("Informe o valor de b: ");
        double b = scan.nextDouble();
        double x = -b/a;

        System.out.println("resultado: " + x);

        scan.close();

    }
}
