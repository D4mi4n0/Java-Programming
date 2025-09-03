package Parcheggio;

public class Parcheggio {

    private int capienza;
    private VeicoloAbstract[] parcheggio;
    private int postiOccupati;

    public Parcheggio(int capienza) {
        this.capienza = capienza;
        this.parcheggio = new VeicoloAbstract[capienza];
        this.postiOccupati = 0;
    }

    public void entrata(VeicoloAbstract veicolo, Ticket biglietto) {
        if (postiOccupati < capienza) {
            parcheggio[postiOccupati] = veicolo;
            postiOccupati++;
            veicolo.setBiglietto(biglietto);
        } else {
            throw new RuntimeException("Parcheggio pieno");
        }
    }

}