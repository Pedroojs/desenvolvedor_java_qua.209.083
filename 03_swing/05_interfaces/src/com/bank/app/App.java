package com.bank.app;

import javax.swing.JOptionPane;

import com.bank.models.Conta;

public class App {
    public static void main(String[] args) throws Exception {

        Conta cc = new Conta();

        String[] opcoes = { "Depositar", "Sacar", "Consultar Dados", "Sair" };
        Object escolha;

        cc.setTitular(JOptionPane.showInputDialog("Informe o nome do titular da conta:"));
        cc.setCpf(JOptionPane.showInputDialog("Informe o CPF do titular:"));

        // gera um numero de conta simples
        String numeroConta = "0001" + "-" + (int) (Math.random() * 90
         + 2);
        cc.setNConta(numeroConta);

        //com no maximo 1 digitos aleatorios
        cc.setAgencia("00" + (int) (Math.random() * 9 + 1));

        cc.setSaldo(0);

        // verifica se a conta foi criada com sucesso
        if (cc.getNConta() != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Conta criada com sucesso!\nNúmero da Conta: " + cc.getNConta() +
                            "\nAgência: " + cc.getAgencia());
        }

        do {
            escolha = JOptionPane.showInputDialog(
                    null,
                    "Escolha uma opção:",
                    "Banco PH",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            switch ((String) escolha) {
                case "Depositar":
                    double valorDeposito = Double.parseDouble(
                            JOptionPane.showInputDialog("Informe o valor a depositar:"));
                    cc.depositar(valorDeposito);
                    JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                    break;

                case "Sacar":
                    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a sacar:"));
                    if (valorSaque >= 0 && valorSaque <= cc.getSaldo()) {
                        cc.sacar(valorSaque);
                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente para saque.");
                    }
                    break;

                case "Consultar Dados":
                    JOptionPane.showMessageDialog(null, cc.consultarDados());
                    break;

                case "Sair":
                    JOptionPane.showMessageDialog(null, "Obrigado por usar o Banco PH!");
                    break;
            }

        } while (!escolha.equals("Sair"));
    }
}
