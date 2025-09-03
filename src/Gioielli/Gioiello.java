package Gioielli;

public class Gioiello {

    private Prezioso[] preziosi;
    private int numPreziosi;

    public Gioiello(int maxPreziosi) {
        if (maxPreziosi < 1) {
            throw new IllegalArgumentException("Il numero massimo di preziosi deve essere maggiore o uguale a uno");
        }
        this.preziosi = new Prezioso[maxPreziosi];
        this.numPreziosi = 0;
    }

    public boolean add(Prezioso p) {
        if (p == null || numPreziosi >= preziosi.length) {
            return false;
        }
        preziosi[numPreziosi] = p;
        numPreziosi++;
        return true;
    }

    public boolean check() {
        int sommaCaratiPietre = 0;
        int pesoTotale = 0;
        for (int i = 0; i < numPreziosi; i++) {
            pesoTotale = pesoTotale + preziosi[i].getPeso();
            if (preziosi[i] instanceof Pietra) {
                sommaCaratiPietre = sommaCaratiPietre + preziosi[i].getCarati();
            }
        }
        return sommaCaratiPietre > pesoTotale;
    }

    public int caratiPietre() {
        int sommaCaratiPietre = 0;
        for (int i = 0; i < numPreziosi; i++) {
            if (preziosi[i] instanceof Pietra) {
                sommaCaratiPietre = sommaCaratiPietre + preziosi[i].getCarati();
            }
        }
        return sommaCaratiPietre;
    }
}
