//comando para identar o código: shift + alt + f

package com.variaveis.app;

public class App {
    public static void main(String[] args) throws Exception {

        // String com o nome
        String name = "Pedro";
        short age = 20;
        float height = 1.72f;

        // validações
        if (name != null && age > 0) {

            // mostrando o nome na tela: Estilo C
            System.out.printf("Hello, %s!\n", name);

            // mostrando o nome na tela: Estilo Java
            System.out.println("Hello, " + name + "!");
        }

        System.out.printf("Altura: %.2f\nIdade: %d", height, age);

    }
}
