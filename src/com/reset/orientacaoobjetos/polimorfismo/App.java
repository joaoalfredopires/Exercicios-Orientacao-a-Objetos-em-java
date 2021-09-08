package com.reset.orientacaoobjetos.polimorfismo;

public class App {

    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero(50.00, 5, 4, "Marrom");
        Peixe peixe = new Peixe(1.2, 1, 0, "Cinza");
        Reptil reptil = new Reptil(0.850, 2, 4, "Verde");
        Ave ave = new Ave(0.450, 3, 2, "Amarelo e Preto");

        Canguru canguru = new Canguru(70.0, 8, 4, "Amarelo");
        Cachorro cachorro = new Cachorro(32.5, 5, 4, "Preto");
        Cobra cobra = new Cobra(2.7, 2, 0, "verde");
        Tartaruga tartaruga = new Tartaruga(7.3, 96, 4, "Verde escuro");
        GoldFish goldFish = new GoldFish(0.127, 1, 0, "Dourado");
        Arara arara = new Arara(2.54, 3, 2, "Azul");

        cachorro.reagir(8, 15.6);

    }
}
