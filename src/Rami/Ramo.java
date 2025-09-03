package Rami;

public class Ramo {

    private float lunghezza;
    private Ramo[] sottoRami;
    private int maxRami;
    private int numRami;

    public Ramo(float v, int n) {
        if (v <= 0 || n <= 0) {
            throw new IllegalArgumentException("Lunghezza e numero di rami devono essere maggiori di zero.");
        }
        this.lunghezza = v;
        this.maxRami = n;
        this.numRami = 0;
        this.sottoRami = new Ramo[n];
    }

    public boolean add(Ramo s) {
        // Se il ramo è nullo oppure è uguale al ramo in oggetto (this), ritorna false
        if (s == null || s == this) {
            return false;
        }
        // Se il ramo s è più lungo del ramo in oggetto
        // Oppure se il numero di rami raggiunge (o supera) il massimo consentito
        // Ritorna false
        if (s.lunghezza > this.lunghezza || numRami >= maxRami) {
            return false;
        }
        // Altrimenti, aggiunge il ramo s al ramo in oggetto
        sottoRami[numRami] = s;
        numRami++;
        return true;
    }

    public float getLunghezza() {
        return lunghezza;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ramo di lunghezza: ").append(lunghezza).append("\n");
        sb.append("Sotto-rami:\n");
        for (int i = 0; i < numRami; i++) {
            sb.append(" - ").append(sottoRami[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public float lunghezzaTotale() {
        float totale = lunghezza;
        for (int i = 0; i < numRami; i++) {
            totale = totale + sottoRami[i].lunghezzaTotale();
        }
        return totale;
    }

}