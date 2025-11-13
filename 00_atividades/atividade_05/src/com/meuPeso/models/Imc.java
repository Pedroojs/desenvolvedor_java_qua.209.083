package com.meuPeso.models;

public class Imc {
    private double peso;
    private double altura;

    public Imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularImc() {
        return peso / (altura * altura);
    }

    public String classificarImc() {
        double imc = calcularImc();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
