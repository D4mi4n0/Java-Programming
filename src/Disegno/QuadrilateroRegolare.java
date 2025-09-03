package Disegno;

public abstract class QuadrilateroRegolare implements Figura {

    private double base;
    private double altezza;

    public QuadrilateroRegolare(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getPerimetro() {
        return 4 * base;
    }

    public double getArea() {
        return base * altezza;
    }

}