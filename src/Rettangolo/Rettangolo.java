package Rettangolo;

public class Rettangolo {

    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) throws Exception {
        if (base <= 0 || altezza <= 0) {
            throw new Exception("Le dimensioni del rettangolo devono essere maggiori di zero.");
        }
        this.base = base;
        this.altezza = altezza;
    }

    public void ridimensiona(double nuovaBase, double nuovaAltezza) throws Exception {
        if (nuovaBase <= 0 || nuovaAltezza <= 0) {
            throw new Exception("Le dimensioni del rettangolo devono essere maggiori di zero.");
        }
        base = nuovaBase; // assegno alla base il nuovo valore della base
        altezza = nuovaAltezza; // assegno all'altezza il nuovo valore dell'altezza
    }

    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }

    public double calcolaArea() {
        return base * altezza;
    }

}