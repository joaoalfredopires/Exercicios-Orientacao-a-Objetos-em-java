package com.reset.orientacaoobjetos.heranca;

public class Funcionario extends Pessoa{
    //Atributos
    private String setor;
    private boolean trabalhando;

    //Métodos
    public void mudarTrabalhando() {
        this.trabalhando = ! this.trabalhando;
    }

    //Métodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
