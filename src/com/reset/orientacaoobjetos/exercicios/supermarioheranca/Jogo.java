package com.reset.orientacaoobjetos.exercicios.supermarioheranca;

import java.util.Random;

public class Jogo {

    //Atributos
    private Personagem player1;
    private Personagem player2;
    private boolean escolhaValida;


    //Métodos públicos

    public void escolhaPersonagem(Personagem p1, Personagem p2) {
        if (p1.getNome() != p2.getNome()) {
            this.setEscolhaValida(true);
            this.setPlayer1(p1);
            this.setPlayer2(p2);
        } else {
            this.setEscolhaValida(false);
            this.setPlayer1(null);
            this.setPlayer2(null);
        }
            System.out.println("==========ESCOLHA DE PERSONAGEM==========");
            System.out.println("Player 1 " + p1.getNome());
            System.out.println("Player 2 " + p2.getNome());
            System.out.println("=========================================");

    }

    public void jogar() {
        Random aleatório = new Random();
        int moedasColetadas = aleatório.nextInt(30);
        int moedasColetadas1 = aleatório.nextInt(30);


        if (this.escolhaValida) {
            System.out.println("##### SUPER MARIO BROS #####");

            for (int i = 0; i <= moedasColetadas; i++) {
                this.player1.coletarMoeda();
            }

            for (int i = 0; i <= moedasColetadas1; i++) {
                this.player2.coletarMoeda();
            }

            this.player1.caracteristicasPersonagem();
            this.player2.caracteristicasPersonagem();

        } else {
            System.out.println("ERRO! Os personagens precisam ser diferentes.");
        }
    }


    //Métodos especiais

    public Personagem getPlayer1() {
        return player1;
    }

    public void setPlayer1(Personagem player1) {
        this.player1 = player1;
    }

    public Personagem getPlayer2() {
        return player2;
    }

    public void setPlayer2(Personagem player2) {
        this.player2 = player2;
    }

    public boolean isEscolhaValida() {
        return escolhaValida;
    }

    public void setEscolhaValida(boolean escolhaValida) {
        this.escolhaValida = escolhaValida;
    }
}
