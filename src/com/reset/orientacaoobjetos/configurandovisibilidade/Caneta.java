package com.reset.orientacaoobjetos.configurandovisibilidade;

public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor da caneta " + this.cor);
        System.out.println("Expessura da ponta: " + this.ponta);
        System.out.println("Nível de carga: " + this.carga);
        System.out.println("A caneta está tampada? " + this.tampada);
    }

    public void rabiscar() {

        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar tampada");
        } else {
            System.out.println("Estou rabiscando");
        }

    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
