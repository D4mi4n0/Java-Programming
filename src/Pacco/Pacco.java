package Pacco;

public class Pacco {

    private double peso;

    public Pacco(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Il peso deve essere maggiore di 0");
        }
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

}