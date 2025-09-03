package Parcheggio;

public class VeicoloAbstract {

    private String targa;
    private int posti;
    private TipoVeicolo tipo;
    private Ticket biglietto;

    public VeicoloAbstract(String targa, int posti, TipoVeicolo tipo) {
        this.targa = targa;
        this.posti = posti;
        this.tipo = tipo;
    }

    public Ticket getBiglietto() {
        return biglietto;
    }

    public void setBiglietto(Ticket biglietto) {
        this.biglietto = biglietto;
    }

    public String getTarga() {
        return targa;
    }

}