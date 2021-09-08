package com.reset.orientacaoobjetos.heranca;

public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private double salario;

    //Métodos
    public void receberAumento(double aumento) {
        this.salario += aumento;
    }

    //Métodos Especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
