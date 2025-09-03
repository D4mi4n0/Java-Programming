package Pacco;

public class ZatteraGalleggiante {

    private double altezza;
    private double larghezza;
    private Pacco[] pacchi;
    private Punto[] posizioni;
    private int numeroPacchi;

    public ZatteraGalleggiante(double altezza, double larghezza) {
        if (altezza <= 0 || larghezza <= 0) {
            throw new IllegalArgumentException("Valori non validi");
        }
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.pacchi = new Pacco[100];
        this.posizioni = new Punto[100];
        this.numeroPacchi = 0;
    }

    public void aggiungiPacco(Pacco pacco, Punto posizione) {
        if (pacco == null || posizione == null) {
            throw new IllegalArgumentException("Valori non validi");
        }
        if (numeroPacchi >= pacchi.length) {
            throw new IllegalArgumentException("Zattera piena");
        }
        // Se la posizione è fuori dalla zattera, lancio un'eccezione
        if (posizione.getX() < 0 || posizione.getX() > larghezza || posizione.getY() < 0 || posizione.getY() > altezza) {
            throw new IllegalArgumentException("Posizione non valida");
        }
        pacchi[numeroPacchi] = pacco;
        posizioni[numeroPacchi] = posizione;
        numeroPacchi++;
    }

    public double getPesoTotale() {
        double pesoTotale = 0;
        for (int i = 0; i < numeroPacchi; i++) {
            pesoTotale = pesoTotale + pacchi[i].getPeso();
        }
        return pesoTotale;
    }

    public double getPesoMedio() {
        // Basta dividere il peso totale per il numero di pacchi
        return getPesoTotale() / numeroPacchi;
    }

    public Punto getBaricentro() {
        // Alla fine so quanto pesa un pacco e in quale posizione si trova
        double sommaPeso = 0;
        double sommaX = 0;
        double sommaY = 0;
        // Itero su tutti i pacchi
        // E calcolo il peso totale e la somma delle posizioni
        for (int i = 0; i < numeroPacchi; i++) {
            sommaPeso = sommaPeso + pacchi[i].getPeso();
            sommaX = sommaX + pacchi[i].getPeso() * posizioni[i].getX();
            sommaY = sommaY + pacchi[i].getPeso() * posizioni[i].getY();
        }
        // E restituisco il baricentro, cioè la media delle posizioni
        return new Punto(sommaX / sommaPeso, sommaY / sommaPeso);
    }

}