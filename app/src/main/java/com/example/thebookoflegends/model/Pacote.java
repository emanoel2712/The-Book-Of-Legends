package com.example.thebookoflegends.model;

public class Pacote {
    private String nome;
    private String descricao;
    private int image;
    private Integer quantidade;
    private double valor;

    public Pacote() {
    }

    public Pacote(String nome, String descricao, int image, Integer quantidade, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.image = image;
        this.quantidade = quantidade;
        this.valor = valor;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
