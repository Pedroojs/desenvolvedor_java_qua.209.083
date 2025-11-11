package com.gui.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //!SECTION
        

        String nome = JOptionPane.showInputDialog("informe seu nome:" );
        int idade = Integer.parseInt(JOptionPane.showInputDialog("informe a sua idade:" ));

        String resultado = idade >= 18 ? "é maior de idade" : "é menor de idade";
        
        JOptionPane.showMessageDialog(null, nome+" "+resultado+".");
    }
}
