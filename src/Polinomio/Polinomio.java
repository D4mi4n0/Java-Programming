package Polinomio;

public class Polinomio {

    private final double[] coefficienti;

    // Costruttore
    public Polinomio(int numeroCoefficienti) {
        if (numeroCoefficienti < 0) {
            throw new IllegalArgumentException("numeroCoefficienti deve essere >= 0");
        }
        coefficienti = new double[numeroCoefficienti];
        // Inizializza tutti i coefficienti a 0 (di default già 0)
    }

    // Numero massimo di coefficienti
    public int numeroCoefficienti() {
        return coefficienti.length;
    }

    // Imposta il coefficiente di grado k al valore c
    public boolean set(int k, double c) {
        if (k < 0 || k >= coefficienti.length) {
            return false;
        }
        coefficienti[k] = c;
        return true;
    }

    // Restituisce il valore del coefficiente di grado k, o zero se k non valido
    public double get(int k) {
        if (k < 0 || k >= coefficienti.length) {
            return 0.0;
        }
        return coefficienti[k];
    }

    // Restituisce il grado del polinomio
    public int grado() {
        for (int i = coefficienti.length - 1; i >= 0; i--) {
            if (coefficienti[i] != 0.0) {
                return i;
            }
        }
        return 0;
    }

    // Valuta il polinomio nel punto x
    public double eval(double x) {
        double result = 0.0;
        double potenza = 1.0;
        for (int i = 0; i < coefficienti.length; i++) {
            result = result + coefficienti[i] * potenza;
            potenza = potenza * x;
        }
        return result;
    }

    // Somma con un altro polinomio
    public Polinomio somma(Polinomio p) {
        // Trova la lunghezza massima tra i due polinomi
        int maxLength = Math.max(this.coefficienti.length, p.coefficienti.length);
        Polinomio result = new Polinomio(maxLength);
        // Itero sui coefficienti fino alla lunghezza massima
        for (int i = 0; i < maxLength; i++) {
            double a = this.coefficienti[i];
            double b = p.coefficienti[i];
            result.coefficienti[i] = a + b;
        }
        return result;
    }

    // Moltiplica per un monomio c*x^k
    public Polinomio moltiplica(double c, int k) {
        // Controlla che il grado del monomio sia valido
        if (k < 0) {
            throw new IllegalArgumentException("Il grado del monomio deve essere >= 0");
        }
        // Crea un nuovo polinomio con spazio per i coefficienti
        Polinomio result = new Polinomio(coefficienti.length + k);
        // Itero sui coefficienti del polinomio originale
        for (int i = 0; i < coefficienti.length; i++) {
            // Moltiplico il coefficiente per c e lo posiziono nella posizione corretta
            result.coefficienti[i + k] = coefficienti[i] * c;
        }
        return result;
    }

    // Moltiplica per un altro polinomio
    public Polinomio moltiplica(Polinomio p) {
        int lenA = this.coefficienti.length;
        int lenB = p.coefficienti.length;
        // Crea un nuovo polinomio con la lunghezza adeguata
        Polinomio result = new Polinomio(lenA + lenB - 1);
        // Itero su i coefficienti di entrambi i polinomi (A e B)
        for (int i = 0; i < lenA; i++) {
            for (int j = 0; j < lenB; j++) {
                result.coefficienti[i + j] = result.coefficienti[i + j] + this.coefficienti[i] * p.coefficienti[j];
            }
        }
        return result;
    }

}