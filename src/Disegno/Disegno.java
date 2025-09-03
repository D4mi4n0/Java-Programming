package Disegno;

public class Disegno {

    private Figura[] figure;
    private int numFigure;

    public Disegno(int numFigure) {
        this.figure = new Figura[100];
        this.numFigure = 0;
    }

    public void aggiungiFigura(Figura f) {
        if (f == null || numFigure >= figure.length) {
            throw new IllegalArgumentException("Valori non validi");
        }
        figure[numFigure] = f;
        numFigure++;
    }

    public double getAreaTotale() {
        double areaTotale = 0;
        for (int i = 0; i < numFigure; i++) {
            areaTotale = areaTotale + figure[i].getArea();
        }
        return areaTotale;
    }

    public double getPerimetroTotale() {
        double perimetroTotale = 0;
        for (int i = 0; i < numFigure; i++) {
            perimetroTotale = perimetroTotale + figure[i].getPerimetro();
        }
        return perimetroTotale;
    }

    @Override
    public String toString() {
        return "Disegno: [Numero figure=" + numFigure + ", Area totale = " + getAreaTotale() + ", Perimetro totale = " + getPerimetroTotale() + "]";
    }

}