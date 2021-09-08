package com.reset.orientacaoobjetos.exercicios.supermarioheranca;

public class Luigi extends Personagem{

    public Luigi(String nome, int idade, double altura) {
        super(nome, idade, altura);
    }

    public void voar() {
        System.out.println("Luigi está voando");
    }

    @Override
    public void crescer() {
        this.setAltura(this.getAltura() + (this.getAltura() * 0.75));
    }
}
