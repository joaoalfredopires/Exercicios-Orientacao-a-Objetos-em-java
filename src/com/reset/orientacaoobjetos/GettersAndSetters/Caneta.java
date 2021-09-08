package com.reset.orientacaoobjetos.GettersAndSetters;

public class Caneta {
    public String modelo;
    private double ponta;
    private String cor;
    private boolean tampada;

    //Método construtor
    public Caneta (String m, double p, String c, boolean tamp) {
        this.setModelo(m);
        this.setPonta(p);
        this.setCor(c);
        this.setTampada(tamp);
    }

    //Getters e Setters
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo (String m) {
        this.modelo = m;
    }

    public double getPonta() {
        return this.ponta;
    }
    public void setPonta(double p) {
        this.ponta = p;
    }

    public String getCor () {
        return this.cor;
    }
    public void setCor (String c) {
        this.cor = c;
    }

    public Boolean getTampada () {
        return this.tampada;
    }
    public void setTampada (boolean tamp) {
        this.tampada = tamp;
    }


    //Métodos
        public void tampar() {
            this.tampada = true;
        }
        public void destampar() {
            this.tampada = false;
        }

    public void status () {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Está tampada?: " + this.getTampada());
    }
}
