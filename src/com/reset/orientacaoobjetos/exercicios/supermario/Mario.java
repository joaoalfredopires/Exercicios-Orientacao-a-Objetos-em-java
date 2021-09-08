package com.reset.orientacaoobjetos.exercicios.supermario;

public class Mario {

    //Características
    public String corPele;
    public String porteFisico;
    protected String corDosOlhos;
    protected String corDoCabeloEBarba;
    public String vestimentas;
    protected int tamanho;
    private double tamanhoComCogumelo = tamanho + 0.5;
    private boolean onFire;

    //Status
    void status() {
        System.out.println("Características: ");
        System.out.println("Cor da pele: " + this.corPele);
        System.out.println("Porte físico: " + this.porteFisico);
        System.out.println("Cor dos olhos: " + this.corDosOlhos);
        System.out.println("Cor do cabelo e barba: " + this.corDoCabeloEBarba);
        System.out.println("Tamanho: " + this.tamanho);
    }

    //Poderes

    void comeuFlor() {
        this.onFire = true;
    }
    void naoComeuFlor() {
        this.onFire = false;
    }

    void bolaDeFogo() {
        if (this.onFire == false) {
            System.out.println("Só é possível soltar bola de fogo no modo onFire");
        } else {
            System.out.println("Solta bola de fogo");
        }
    }
}
