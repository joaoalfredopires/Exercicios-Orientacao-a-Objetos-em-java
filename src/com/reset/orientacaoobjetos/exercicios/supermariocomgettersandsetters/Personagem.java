package com.reset.orientacaoobjetos.exercicios.supermariocomgettersandsetters;

public class Personagem {
    private String nome;
    private int idade;
    private double altura;
    private int stamina;

    //Método construtor
        public Personagem(String nome, int idade, double altura) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setAltura(altura);
        this.stamina = 100;
    }

    //Getters and Setters
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getStamina() {
        return stamina;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    //Métodos
    public void status() {
        System.out.println("--------------------");
        System.out.println("Características do personagem: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Stamina: " + getStamina());
        System.out.println("--------------------");
    }

    public void superPoderes() {
        System.out.println("Poderes:");
        System.out.println("Força sobrehumana, super salto, super velocidade, dentre outros.");
    }

    public void ganhoStamina() {
            System.out.println("Stamina +10");
        this.setStamina(getStamina() + 10);

        if (getStamina() > 100) {
            setStamina(100);
        }
    }

    public void perdaStamina() {
            System.out.println("Stamina -10");
        this.setStamina(getStamina() - 10);

            if (getStamina() < 0) {
                setStamina(0);
            }
    }

    public void crescer() {
        System.out.println("Comeu cogumelo");

        this.setAltura(getAltura() * 2);
    }
}
