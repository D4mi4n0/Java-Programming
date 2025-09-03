package Polinomio;

public class Main {
    public static void main(String[] args) {
        try {
            // Creazione di polinomi
            Polinomio p1 = new Polinomio(3); // Polinomio con 3 coefficienti
            p1.set(0, 1.0); // Imposta il termine costante a 1
            p1.set(1, 2.0); // Imposta il coefficiente di x a 2
            p1.set(2, 3.0); // Imposta il coefficiente di x^2 a 3

            Polinomio p2 = new Polinomio(2); // Polinomio con 2 coefficienti
            p2.set(0, 4.0); // Imposta il termine costante a 4
            p2.set(1, 5.0); // Imposta il coefficiente di x a 5

            // Stampa dei polinomi
            System.out.println("Polinomio p1:");
            stampaPolinomio(p1);
            System.out.println("Polinomio p2:");
            stampaPolinomio(p2);

            // Somma dei polinomi
            Polinomio somma = p1.somma(p2);
            System.out.println("Somma di p1 e p2:");
            stampaPolinomio(somma);

            // Moltiplicazione di un polinomio per un monomio
            Polinomio moltiplicatoMonomio = p1.moltiplica(2.0, 1); // Moltiplica p1 per 2x
            System.out.println("Moltiplicazione di p1 per 2x:");
            stampaPolinomio(moltiplicatoMonomio);

            // Moltiplicazione di due polinomi
            Polinomio prodotto = p1.moltiplica(p2);
            System.out.println("Prodotto di p1 e p2:");
            stampaPolinomio(prodotto);

            // Valutazione di un polinomio
            double valore = p1.eval(2.0); // Valuta p1 nel punto x = 2
            System.out.println("Valutazione di p1 in x = 2: " + valore);

        } catch (Exception e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }

    // Metodo per stampare un polinomio
    private static void stampaPolinomio(Polinomio p) {
        for (int i = 0; i < p.numeroCoefficienti(); i++) {
            double coeff = p.get(i);
            if (coeff != 0) {
                System.out.print((coeff > 0 && i > 0 ? " + " : "") + coeff + (i > 0 ? "x^" + i : ""));
            }
        }
        System.out.println();
    }
}