package Evento;

public class Biglietto {

    // variabili statiche che rappresentano
    // il numero di biglietti e il numero massimo di biglietti
    private static int numBiglietti = 0;
    private static int MAX_BIGLIETTI = 1000;

    private int seriale;
    private Evento evento;

    public Biglietto(Evento evento) throws Exception {
        if (numBiglietti >= MAX_BIGLIETTI) {
            throw new Exception("Massimo numero di biglietti raggiunto");
        }
        // incremento il numero di biglietti
        numBiglietti++;
        this.evento = evento;
        // assegno il seriale a quel biglietto
        this.seriale = numBiglietti;
    }

    @Override
    public String toString() {
        return "Biglietto " + seriale + " per l'evento " + evento;
    }

}