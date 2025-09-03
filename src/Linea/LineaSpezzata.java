package Linea;

public class LineaSpezzata {

    private Segmento[] segmenti;
    private int numeroSegmenti;

    public LineaSpezzata() {
        this.segmenti = new Segmento[100];
        this.numeroSegmenti = 0;
    }

    public void aggiungiSegmento(Segmento s) {
        // Se s è null o, nel caso la linea spezzata già
        // contenga altri segmenti, il punto finale dell’ultimo segmento
        // nella linea è diverso dal punto iniziale del segmento s
        // Viene lanciata un'eccezione IllegalArgumentException
        if (s == null || (numeroSegmenti > 0 && !segmenti[numeroSegmenti - 1].getFine().equals(s.getInizio()))) {
            throw new IllegalArgumentException("Segmento non valido");
        }
        segmenti[numeroSegmenti] = s;
        numeroSegmenti++;
    }

    public int numeroSegmenti() {
        return numeroSegmenti;
    }

    public double lunghezza() {
        double lunghezzaTotale = 0;
        // Itero su tutti i segmenti e sommo le loro lunghezze
        for (int i = 0; i < numeroSegmenti; i++) {
            lunghezzaTotale = lunghezzaTotale + segmenti[i].lunghezza();
        }
        return lunghezzaTotale;
    }

    public double lunghezzaMedia() {
        return lunghezza() / numeroSegmenti;
    }

}