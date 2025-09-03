package Disegno;

public class Rettangolo extends QuadrilateroRegolare {

    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        super(base, altezza);
        if (base <= 0 || altezza <= 0) {
            throw new IllegalArgumentException("Base e altezza devono essere maggiori di 0");
        }
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
        return 2 * (base + altezza);
    }

    public double getArea() {
        return base * altezza;
    }

    @Override
    public String toString() {
        return "Rettangolo [base=" + base + ", altezza=" + altezza + "]";
    }

}