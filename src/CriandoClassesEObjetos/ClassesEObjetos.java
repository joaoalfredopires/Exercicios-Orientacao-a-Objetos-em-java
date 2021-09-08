package CriandoClassesEObjetos;

public class ClassesEObjetos {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5;
        c1.destampar();

        c1.status();
        c1.rabiscar();

    }
}
