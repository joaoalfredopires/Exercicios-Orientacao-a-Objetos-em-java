package com.reset.orientacaoobjetos.exercicios.supermarioheranca;

public class Yoshi extends Personagem {
    private int frutasComidas;
    private int velocidade;


    public Yoshi(String nome, int idade, double altura) {
        super(nome, idade, altura);
        this.frutasComidas = 0;
        this.velocidade = 10;
    }

    //Metodos públicos
    public void comerFruta() {
        this.setFrutasComidas(this.frutasComidas++);
        System.out.println("Yoshi comeu uma fruta");

        if (frutasComidas % 2 == 0) {
            this.setVelocidade(this.getVelocidade() * 2);
        }
    }

    @Override
    public void crescer() {
        this.setAltura(this.getAltura() + (this.getAltura() * 0.10));
    }

    //Métodos especiais

    public int getFrutasComidas() {
        return frutasComidas;
    }

    public void setFrutasComidas(int frutasComidas) {
        this.frutasComidas = frutasComidas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
