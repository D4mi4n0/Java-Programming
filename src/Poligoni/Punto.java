package Poligoni;

public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) throws Exception {
        if (x <= 0.0 || y <= 0.0) {
            throw new Exception("Le coordinate devono essere maggiori di zero.");
        }
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanza(Punto p) throws Exception {
        if (p == null) {
            throw new Exception("Il punto non può essere nullo.");
        }
        // Se i valori di p sono gli stessi del punto a cui è applicato il metodo
        // Ritorna 0.0 (poiché double)
        if (this.x == p.x && this.y == p.y) {
            return 0.0;
        }
        // Altrimenti calcola la distanza tra i due punti tramite Pitagora
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    public boolean equals(Punto p) throws Exception {
        if (p == null) {
            return false;
        }
        // Se i valori di p sono gli stessi del punto a cui è applicato il metodo
        // Ritorna true (poiché boolean) --> Ritorna esplicitamente che i due punti sono uguali
        return this.x == p.x && this.y == p.y;
    }

}