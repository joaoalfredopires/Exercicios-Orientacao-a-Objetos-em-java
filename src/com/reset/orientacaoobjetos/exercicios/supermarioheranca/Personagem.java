package com.reset.orientacaoobjetos.exercicios.supermarioheranca;

public abstract class Personagem {
    private String nome;
    private int idade;
    private double altura;
    private int stamina;
    private int quantMoedas;
    private int quantVidas;

    //Método construtor
        public Personagem(String nome, int idade, double altura) {

            this.setNome(nome);
            this.setIdade(idade);
            this.setAltura(altura);
            this.setQuantMoedas(0);
            this.setQuantVidas(1);
            this.setStamina(100);
    }

    //Getters and Setters
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getQuantMoedas() { return this.quantMoedas; }
    public void setQuantMoedas(int quantMoedas) { this.quantMoedas = quantMoedas; }

    public int getQuantVidas() { return this.quantVidas; }
    public void setQuantVidas(int quantVidas) { this.quantVidas = quantVidas; }

    public int getStamina() {
        return stamina;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    //Métodos
    public void caracteristicasPersonagem() {
        System.out.println("--------------------");
        System.out.println("Características do personagem: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Stamina: " + getStamina());
        System.out.println("Moedas: " + getQuantMoedas());
        System.out.println("Vidas restantes: " + getQuantVidas());
        System.out.println("--------------------");
    }

    public void superPoderes() {
        System.out.println("Poderes:");
        System.out.println("Força sobrehumana, super salto, super velocidade, dentre outros.");
    }

    public void ganhoStamina() {
            System.out.println("Stamina +10");
        this.setStamina(getStamina() + 10);

        if (getStamina() > 100) {
            setStamina(100);
        }
    }

    public void perdaStamina() {
            System.out.println("Stamina -10");
        this.setStamina(getStamina() - 10);

            if (getStamina() < 0) {
                setStamina(0);
            }
    }

    public abstract void crescer();

    //Sobrecarga
    public void saltar() {
        System.out.println(this.getNome() + " pulou uma altura de " + (this.getAltura() + (this.getAltura() * 0.5)));
    }

    public void saltar(double tamanhoObstaculo) {
        System.out.println("Tamanho do obstáculo: " + tamanhoObstaculo + ". " + this.getNome() + " pulou uma altura de " + (tamanhoObstaculo + (tamanhoObstaculo * 0.5)));
    }
    //Fim sobrecarga

    public void revigorar() {
        System.out.println("Stamina revigorada" );
            this.setStamina(100);
    }

    public void morrer() {
        System.out.println("Faliceu!");

        this.setStamina(0);

        if (this.getQuantVidas() < 0) {
            this.setQuantVidas(0);
        } else if (this.getQuantVidas() > 0) {
            this.setQuantVidas(this.getQuantVidas() - 1);
            this.setStamina(100);
        }

        if (this.getQuantVidas() == 0 && this.getStamina() == 0) {
            System.out.println("GAME OVER");
        }
    }

    public void coletarMoeda() {
        System.out.println("PLIN! Moeda coletada por " + getNome());

        this.setQuantMoedas(this.getQuantMoedas() + 1);

        if (this.getQuantMoedas() % 10 == 0) {
            this.setQuantVidas(this.getQuantVidas() + 1);
        }
    }
}
