package com.reset.orientacaoobjetos.polimorfismo;

public class Mamifero extends Animal{
    protected String corPelo;

    public Mamifero(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.setCorPelo(corPelo);
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
