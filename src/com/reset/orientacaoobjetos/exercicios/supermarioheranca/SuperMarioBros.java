package com.reset.orientacaoobjetos.exercicios.supermarioheranca;

public class SuperMarioBros {

    public static void main(String[] args) {

        Yoshi yoshi = new Yoshi("Yoshi", 2, 2.00);
        Mario mario = new Mario("Mario Bross", 45, 1.5);
        Luigi luigi = new Luigi("Luiji Bros", 38, 1.85);

        mario.saltar();
        mario.saltar(2.0);

    }
}
