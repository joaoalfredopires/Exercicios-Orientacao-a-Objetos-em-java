package com.reset.orientacaoobjetos.exercicios.supermarioecapsulamento;

public class ProgramaSuperMario {

    public static void main(String[] args) {
        Personagem marioBros = new Personagem("Mario", 45, 1.50);
        Personagem luigiBros = new Personagem("Luigi", 40, 1.75);

        Jogo superMarioBros = new Jogo();

        superMarioBros.escolhaPersonagem(marioBros, luigiBros);
        superMarioBros.jogar();

    }
}
