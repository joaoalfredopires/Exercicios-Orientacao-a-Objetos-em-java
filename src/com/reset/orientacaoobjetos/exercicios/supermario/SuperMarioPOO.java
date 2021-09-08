package com.reset.orientacaoobjetos.exercicios.supermario;

public class SuperMarioPOO {

    public static void main(String[] args) {

    Mario mario = new Mario();

    mario.corPele = "Branca";
    mario.corDoCabeloEBarba = "Castanho";
    mario.corDosOlhos = "Azuis";
    mario.tamanho = 10;
    mario.porteFisico = "Baixo e corpulento";
    mario.vestimentas = "Macacão azul, camisa vermelha e boné vermelho com 'M' estampado";

    mario.status();

    mario.naoComeuFlor();

    mario.bolaDeFogo();


    }
}
