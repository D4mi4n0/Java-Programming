package Disegno;

public class Quadrato extends QuadrilateroRegolare {

    private double lato;

    public Quadrato(double lato) {
        super(lato, lato);
        if (lato <= 0) {
            throw new IllegalArgumentException("Il lato deve essere maggiore di 0");
        }
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double getPerimetro() {
        return 4 * lato;
    }

    public double getArea() {
        return lato * lato;
    }

    @Override
    public String toString() {
        return "Quadrato [lato=" + lato + "]";
    }

}