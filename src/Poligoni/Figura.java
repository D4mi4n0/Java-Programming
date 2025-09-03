package Poligoni;

public class Figura {

    private Punto[] vertice;
    private int numPunti;
    private boolean chiusa = false;

    public Figura(int maxPunti) throws Exception {
        if (maxPunti < 2) {
            throw new Exception("Il numero di punti deve essere maggiore di due.");
        }
        this.vertice = new Punto[maxPunti];
        this.numPunti = 0;
    }

    public boolean add(Punto p) throws Exception {
        if (p == null || numPunti >= vertice.length) {
            return false; // Non aggiunge punti nulli
        }
        // Controlla se la figura è chiusa
        if (chiusa) {
            return false;
        }
        // Controlla se il punto non è uguale al primo punto aggiunto
        if (numPunti > 0 && p.equals(vertice[0])) {
            chiusa = true;
        }
        // Controlla se il punto è presente tra i vertici
        for (int i = 0; i < numPunti; i++) {
            if (p.equals(vertice[i])) {
                return false; // Punto già presente
            }
        }
        vertice[numPunti++] = p; // Aggiunge il punto all'array
        return true; // Punto aggiunto con successo
    }

    public double perimetro() throws Exception {
        // Se il poligono non è chiuso, o il numero di punti è minore di 3, ritorna 0.0
        if (!chiusa || numPunti < 3) {
            return 0.0;
        }
        double perimetro = 0.0;
        // Calcola il perimetro del poligono, sommando le distanze tra i vertici del poligono
        for (int i = 0; i < numPunti; i++) {
            perimetro = perimetro + vertice[i].distanza(vertice[(i + 1) % numPunti]);
        }
        return perimetro;
    }

}