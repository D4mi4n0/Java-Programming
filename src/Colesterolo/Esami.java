package Colesterolo;

public class Esami {

    private Esame[] esami;
    private int numEsami;

    public Esami(int maxEsami) {
        if (maxEsami <= 0) {
            throw new IllegalArgumentException("Il numero massimo di esami deve essere positivo.");
        }
        this.esami = new Esame[maxEsami];
        this.numEsami = 0;
    }

    public boolean add(Esame m) {
        if (m == null || numEsami >= esami.length) {
            return false;
        }
        esami[numEsami] = m;
        numEsami++;
        return true;
    }

    public int trigliceridiMassimo() {
        if (numEsami == 0) {
            return -1; // Nessun esame registrato
        }
        // Inizializziamo il massimo con il primo esame
        int maxTrigliceridi = esami[0].getTrigliceridi();
        for (int i = 1; i < numEsami; i++) {
            // Se c'è un esame con trigliceridi maggiore, aggiorniamo il massimo
            if (esami[i].getTrigliceridi() > maxTrigliceridi) {
                maxTrigliceridi = esami[i].getTrigliceridi();
            }
        }
        return maxTrigliceridi;
    }

    public double mediaIntervalli() {
        double somma = 0;
        for (int i = 0; i < esami.length; i++) {
            somma = somma + esami[i].getLdl() - esami[i].getHdl();
        }
        return somma / esami.length;
    }

}
