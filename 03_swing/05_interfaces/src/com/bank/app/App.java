package com.bank.app;

import javax.swing.JOptionPane;

import com.bank.models.Conta;

public class App {
    public static void main(String[] args) throws Exception {

        Conta cc = new Conta(null, null, "1234-5", "0001", 0.0);

        String [] opcoes = {"Depositar", "Sacar", "Consultar Dados", "Sair"};
        Object escolha;

        cc.setTitular(JOptionPane.showInputDialog("Informe o nome do titular da conta:"));
        cc.setCpf(JOptionPane.showInputDialog("Informe o CPF do titular:"));
        
        //Fzer o laço de opções...


        do {
            escolha = JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:",
                "Banco Java",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );

            switch ((String) escolha) {
                case "Depositar":
                    double valorDeposito = Double.parseDouble(
                        JOptionPane.showInputDialog("Informe o valor a depositar:")
                    );
                    cc.depositar(valorDeposito);
                    JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                    break;

                case "Sacar":
                    double valorSaque = Double.parseDouble(
                        JOptionPane.showInputDialog("Informe o valor a sacar:")
                    );
                    if (cc.sacar(valorSaque) >= 0) {
                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente para saque.");
                    }
                    break;

                case "Consultar Dados":
                    JOptionPane.showMessageDialog(null, cc.consultarDados());
                    break;

                case "Sair":
                    JOptionPane.showMessageDialog(null, "Obrigado por usar o Banco Java!");
                    break;
            }

        } while (!escolha.equals("Sair")); 
    }
}
