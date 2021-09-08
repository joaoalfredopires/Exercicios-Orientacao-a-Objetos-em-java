package com.reset.orientacaoobjetos.polimorfismo;

public class Peixe extends Animal{

    protected String corEscama;

    public Peixe(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.setCorEscama(corEscama);
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
    }

    public void soltarBolha() {
        System.out.println("Soltando bolhas");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
