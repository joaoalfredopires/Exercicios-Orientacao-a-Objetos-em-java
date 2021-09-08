package com.reset.orientacaoobjetos.heranca;

public class Programa {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();

        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        b1.setNome("Jubileu");
        b1.setBolsa(12.5);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
}
