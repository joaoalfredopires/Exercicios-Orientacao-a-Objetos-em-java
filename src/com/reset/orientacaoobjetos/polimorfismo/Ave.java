package com.reset.orientacaoobjetos.polimorfismo;

public class Ave extends Animal{

    protected String corPena;

    public Ave(double peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.setCorPena(corPena);
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cantando");
    }

    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
