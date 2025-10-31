package com.alfandega.app;

//imports
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o nome do passageiro: ");
        String nome  = scan.nextLine();
        System.out.println(("Digite o valor da bagagem em dólares: "));
        double valor = scan.nextDouble();

        String verifica = (valor > 1000) ? " está retido." : " está liberado.";

        System.out.println(nome + 
        verifica);


        scan.close();
    }
}
