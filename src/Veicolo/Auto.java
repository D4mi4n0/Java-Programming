package Veicolo;

public class Auto extends Veicolo {

    private double serbatoio;
    private double livelloSerbatoio;
    private int[] viaggi;
    private int numViaggi;
    private int kmRifornimento;

    public Auto(double c) throws Exception {
        super(c);
        this.serbatoio = 120;
        this.livelloSerbatoio = 0;
        this.viaggi = new int[100];
        this.numViaggi = 0;
        this.kmRifornimento = 0;
    }

    public boolean viaggio(int km) {
        double carburanteNecessario = km * getConsumo();
        if (livelloSerbatoio >= carburanteNecessario) {
            livelloSerbatoio = livelloSerbatoio - carburanteNecessario;
            viaggi[numViaggi] = km;
            numViaggi++;
            return true;
        }
        return false;
    }

    public int rifornimento(double litri) {
        if (litri > 0 && livelloSerbatoio + litri <= serbatoio) {
            livelloSerbatoio = livelloSerbatoio + litri;
            int km = kmRifornimento;
            // Tutti i km sono stati riforniti
            kmRifornimento = 0;
            return km;
        }
        return -1; // rifornimento non effettuato
    }

    public double media() {
        if (numViaggi == 0) {
            return 0.0;
        }
        int somma = 0;
        for (int i = 0; i < numViaggi; i++) {
            somma = somma + viaggi[i];
        }
        return (double) somma / numViaggi;
    }

}