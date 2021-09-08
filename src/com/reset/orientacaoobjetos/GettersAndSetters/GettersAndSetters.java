package com.reset.orientacaoobjetos.GettersAndSetters;

public class GettersAndSetters {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 0.7, "Preta", true);
        Caneta c2 = new Caneta("De Firma", 1.0, "Azul", false);

        c1.status();
        System.out.println("----------");
        c2.status();
    }
}
