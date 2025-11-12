package com.objeto.app;

import javax.swing.JOptionPane;
import com.objeto.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        Pessoa usuario = new Pessoa();

        usuario.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
        usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:")));
        usuario.setCpf(JOptionPane.showInputDialog("Informe seu CPF:"));
        usuario.setEmail(JOptionPane.showInputDialog("Informe seu E-mail:"));
        usuario.setTelefone(JOptionPane.showInputDialog("Informe o seu telefone:"));

        JOptionPane.showMessageDialog(
                null,
                "DADOS DO USUÁRIO:\nNome: " + usuario.getNome() +
                        "\nIdade: " + usuario.getIdade() +
                        "\nCPF: " + usuario.getCpf() +
                        "\nE-mail: " + usuario.getEmail() +
                        "\nTelefone: " + usuario.getTelefone());
    }
}
