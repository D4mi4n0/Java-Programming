package Treno;

public abstract class Vagone {
    
    private int peso;
    
    public Vagone(int peso) throws Exception {
        if (peso <= 0) {
            throw new Exception("Il peso del vagone deve essere maggiore di zero.");
        }
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

}