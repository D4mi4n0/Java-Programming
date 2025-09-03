package Biblioteca;

public class DVD extends ItemBiblioteca {

    private String regista;
    private int durata;

    public DVD(String id, String titolo, int annoDiPubblicazione, String regista, int durata) throws Exception {
        super(id, titolo, annoDiPubblicazione);
        if (regista == null || regista.length() < 2 || durata <= 0) {
            throw new Exception("Il regista non può essere nullo o vuoto e la durata deve essere positiva.");
        }
        this.regista = regista;
        this.durata = durata;
    }

    public String getRegista() {
        return regista;
    }

    public int getDurata() {
        return durata;
    }

    @Override
    public void stampaInfo() {
        System.out.println("ID: " + id);
        System.out.println("Titolo: " + titolo);
        System.out.println("Anno di Pubblicazione: " + annoDiPubblicazione);
        System.out.println("Regista: " + regista);
        System.out.println("Durata: " + durata + " minuti");
    }
}