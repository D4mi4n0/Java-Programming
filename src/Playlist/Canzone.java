package Playlist;

public class Canzone {

    private String titolo;
    private int durata;
    private String[] artisti;

    public Canzone(String titolo, int durata, String... artisti) {
        if (titolo == null || titolo.length() < 1 || titolo.length() > 100)
            throw new IllegalArgumentException("Titolo non valido");
        if (durata < 1 || durata > 30)
            throw new IllegalArgumentException("Durata non valida");
        if (artisti == null || artisti.length == 0)
            throw new IllegalArgumentException("Almeno un artista richiesto");
        this.titolo = titolo;
        this.durata = durata;
        this.artisti = artisti;
    }

    @Override
    public String toString() {
        return "Titolo: " + titolo + "\nDurata: " + durata + "\nArtisti: " + artisti.length;
    }

}