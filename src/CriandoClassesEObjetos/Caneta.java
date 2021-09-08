package CriandoClassesEObjetos;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor da caneta " + this.cor);
        System.out.println("Expessura da ponta: " + this.ponta);
        System.out.println("Nível de carga: " + this.carga);
        System.out.println("A caneta está tampada? " + this.tampada);
    }

    void rabiscar() {

        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar tampada");
        } else {
            System.out.println("Estou rabiscando");
        }

    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
