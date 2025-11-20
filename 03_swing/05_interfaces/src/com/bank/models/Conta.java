package com.bank.models;
import com.bank.repository.Iconta;

public class Conta implements Iconta {
    private String cpf;
    private String titular;
    private double saldo;
    private String agencia;
    private String nConta;

    public Conta() {
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNConta() {
        return this.nConta;
    }

    public void setNConta(String nConta) {
        this.nConta = nConta;
    }


    @Override
    public String consultarDados() {
        return "DADOS DA CONTA:\nTitular: " + this.titular + "\n" +
               "CPF: " + this.cpf + "\n" +
               "Agência: " + this.agencia + "\n" +
               "Número da Conta: " + this.nConta + "\n" +
               "Saldo: R$ " + String.format("%.2f", this.saldo);
    }

    @Override
    public double depositar(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    @Override
    public double sacar(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }


}
