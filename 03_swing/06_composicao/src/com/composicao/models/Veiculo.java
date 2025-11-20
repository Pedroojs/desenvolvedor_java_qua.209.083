package com.composicao.models;

public class Veiculo {
    private String modelo;
    private String placa;
    private String cor;
    private String ano;
    private Pessoa proprietario;

    public Veiculo(){}
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return this.placa;
    } 
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getAno() {
        return this.ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public Pessoa getProprietario() {
        return this.proprietario;
    }
    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }


}
