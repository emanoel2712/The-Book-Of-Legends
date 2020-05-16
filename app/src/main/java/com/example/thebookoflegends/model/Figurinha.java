package com.example.thebookoflegends.model;

public class Figurinha {
    private int image;
    private String nome;
    private String descricao;
    private double valor;

    public Figurinha(int image, String nome, String descricao, double valor) {
        this.image = image;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
