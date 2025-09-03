package Evento;

public class Concerto extends Evento {

    private int posti;
    private String artista;

    public Concerto(int a, int g, int posti, String artista) throws Exception {
        super(a, g);
        if (posti > 200) {
            throw new TroppiPostiException("Troppi posti");
        }
        this.posti = posti;
        this.artista = artista;
    }

}