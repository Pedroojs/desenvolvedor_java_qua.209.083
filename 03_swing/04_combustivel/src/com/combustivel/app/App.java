package com.combustivel.app;

import javax.swing.JOptionPane;

import com.combustivel.models.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
        Combustivel combustivel = new Combustivel();

        String[] opcoes = { "Informar valores", "Sair do programa" };

        // Variável para armazenar a opção selecionada pelo usuário
        Object opcao;

        do {
            // Exibe o menu de opções
            opcao = JOptionPane.showInputDialog(
                    null,
                    "Escolha uma opção:",
                    "Menu",
                    0,
                    null,
                    opcoes,
                    opcoes[0]
                    );

            // Sai do programa se a opção for "Sair do programa"
            if (opcao == "Sair do programa") break;

            combustivel.setGasolina(
                    Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da gasolina:").replace(",", ".")));
            combustivel.setEtanol(
                    Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do etanol:").replace(",", ".")));

            JOptionPane.showMessageDialog(null, combustivel.calcularCombustivel());

        } while (opcao != "sair do programa");

    }
}
