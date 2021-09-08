package com.reset.orientacaoobjetos.polimorfismo;

public class Reptil extends Animal{

    protected String corEscama;

    public Reptil(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.setCorEscama(corEscama);
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo plantas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
