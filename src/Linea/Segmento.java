package Linea;

public class Segmento {

    private Punto inizio;
    private Punto fine;

    public Segmento(Punto inizio, Punto fine) {
        // Controllo se i parametri sono nulli o se sono uguali,
        // ossia hanno gli stessi valori degli attributi x e y
        if (inizio == null || fine == null || inizio.equals(fine)) {
            throw new IllegalArgumentException("I parametri non possono essere nulli o uguali");
        }
        this.inizio = inizio;
        this.fine = fine;
    }

    public Punto getInizio() {
        return inizio;
    }

    public Punto getFine() {
        return fine;
    }

    public double lunghezza() {
        // Calcolo la distanza tra i due punti
        // Cioè la radice quadrata della somma dei quadrati delle differenze
        return Math.sqrt(Math.pow(inizio.getX() - fine.getX(), 2) + Math.pow(inizio.getY() - fine.getY(), 2));
    }

}