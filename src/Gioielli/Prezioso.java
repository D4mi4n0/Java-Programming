package Gioielli;

public abstract class Prezioso {

    private int peso;

    public Prezioso(int peso) throws Exception {
        if (peso <= 0) {
            throw new Exception();
        }
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    abstract public int getCarati();

}