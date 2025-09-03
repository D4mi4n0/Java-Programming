package Parcheggio;

public class Auto extends VeicoloAbstract implements Veicolo {

    public Auto(String targa, int posti, TipoVeicolo tipo) {
        super(targa, posti, tipo);
    }

    @Override
    public String descrizioneMovimento() {
        return null;
    }

}