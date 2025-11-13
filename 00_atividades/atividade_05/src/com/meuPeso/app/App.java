package com.meuPeso.app;

import com.meuPeso.models.Imc;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

    Object option = JOptionPane.showInputDialog(
            null,
            "Escolha uma opção:",
            "Calculadora de IMC",
            JOptionPane.PLAIN_MESSAGE,
            null,
            new String[] { "Calcular IMC", "Sair" },
            "Calcular IMC"
        );
        
        
        do {

        if (option == "Sair") break;
    
        String pesoInput = JOptionPane.showInputDialog("Digite seu peso em kg:").replace(",", ".");
        String alturaInput = JOptionPane.showInputDialog("Digite sua altura em metros:").replace(",", ".");

        double peso = Double.parseDouble(pesoInput);
        double altura = Double.parseDouble(alturaInput);

        Imc imcCalculator = new Imc(peso, altura);
        double imcValue = imcCalculator.calcularImc();
        String imcClassification = imcCalculator.classificarImc();

        String message = String.format("Seu IMC é: %.2f\nClassificação: %s", imcValue, imcClassification);
        JOptionPane.showMessageDialog(null, message);
    }
    while (JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
}

}
