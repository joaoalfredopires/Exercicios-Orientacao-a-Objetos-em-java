package com.reset.orientacaoobjetos.encapsulamento;

public class ProgramaControle {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();

        c.ligar();
        c.play();

        c.abrirMenu();
    }
}
