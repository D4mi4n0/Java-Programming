package Biblioteca;

public class Libro extends ItemBiblioteca {

    private String autore;
    private int numPagine;

    public Libro(String id, String titolo, int annoDiPubblicazione, String autore, int numPagine) throws Exception {
        super(id, titolo, annoDiPubblicazione);
        if (autore == null || autore.length() < 2 || numPagine <= 0) {
            throw new Exception("L'autore non può essere nullo o vuoto.");
        }
        this.autore = autore;
        this.numPagine = numPagine;
    }

    public String getAutore() {
        return autore;
    }

    public int getNumPagine() {
        return numPagine;
    }

    @Override
    public void stampaInfo() {
        System.out.println("ID: " + id);
        System.out.println("Titolo: " + titolo);
        System.out.println("Anno di Pubblicazione: " + annoDiPubblicazione);
        System.out.println("Autore: " + autore);
        System.out.println("Numero di Pagine: " + numPagine);
    }
}