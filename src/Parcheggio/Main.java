/* Scrivere un programma per la gestione di un parcheggio che può
    contenere qualsiasi tipo di mezzo di trasporto.
    Predisporre un controllore che in un determinato giorno può effettuare
    il controllo dei ticket per il parcheggio, lanciando un'eccezione
    ogni volta che un veicolo presenta un ticket scaduto.
 */

package Parcheggio;

public class Main {
    public static void main(String[] args) {
        VeicoloAbstract saetta = new Auto("aa999aa",2,TipoVeicolo.TERRA);
        VeicoloAbstract boeing = new Aereo("747", 500, TipoVeicolo.ARIA);
        Parcheggio garibaldi = new Parcheggio(3);
        Controllore ugo = new Controllore(garibaldi);

        VeicoloAbstract veicolo = saetta;
        Ticket newBiglietto = new Ticket(0,3, veicolo.getTarga());
        garibaldi.entrata(saetta, newBiglietto);
    }
}