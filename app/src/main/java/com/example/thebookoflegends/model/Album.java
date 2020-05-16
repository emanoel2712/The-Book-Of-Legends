package com.example.thebookoflegends.model;

public class Album {
    private int image;
    private String nome;

    public Album() {
    }

    public Album(int image, String nome) {
        this.image = image;
        this.nome = nome;
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
}
