package Biblioteca;

public abstract class ItemBiblioteca {

    protected String id;
    protected String titolo;
    protected int annoDiPubblicazione;

    public ItemBiblioteca(String id, String titolo, int annoDiPubblicazione) {
        this.id = id;
        this.titolo = titolo;
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public abstract void stampaInfo();

}