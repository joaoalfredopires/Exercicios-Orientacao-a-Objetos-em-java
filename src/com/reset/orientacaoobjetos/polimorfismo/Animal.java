package com.reset.orientacaoobjetos.polimorfismo;

public abstract class Animal {
    //Atributos
    protected double peso;
    protected int idade;
    protected int membros;

    //Métodos
    public abstract void locomover();

    public abstract void alimentar();
    public abstract void emitirSom();

    //Construtor
    public Animal(double peso, int idade, int membros) {
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }

    //Métodos especiais
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}
