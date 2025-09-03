package Parcheggio;

public class Aereo extends VeicoloAbstract implements Veicolo {

    public Aereo(String targa, int posti, TipoVeicolo tipo) {
        super(targa, posti, tipo);
    }

    @Override
    public String descrizioneMovimento() {
        return null;
    }

}