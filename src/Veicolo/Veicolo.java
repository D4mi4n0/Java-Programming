/*
 * Data la classe Veicolo descritta sinteticamente
 * con il consumo medio (litri per 100 Km), estenderla
 * con la classe Auto.
 *
 * La classe Auto gestisce il serbatoio del carburate la
 * cui capienza massima è di 120 litri per ogni auto.
 *
 * La classe Auto deve offrire, in aggiunta al costruttore,
 * i seguenti metodi.
 *
 * Il metodo 'viaggio' permette di effettuare un viaggio con
 * i chilometri forniti come parametro, a condizione che la
 * benzina del serbatoio e i consumi del veicolo lo permettano.
 * I chilometri percorsi da ogni viaggio sono memorizzati per
 * supportare il calcolo di informazioni sull'uso dell'auto.
 * Per semplicità si assume un massimo di 100 viaggi.
 *
 * Il metodo 'rifornimento' permette di effettuare il rifornimento
 * se non si eccede la capacità massima del serbatoio. Il metodo
 * restituisce il numero di chilometri percorsi dall'ultimo
 * rifornimento effettuato.
 *
 * Infine, il metodo 'media' restituisce i chilometri che in media
 * sono percorsi in un viaggio.
 */

package Veicolo;

public abstract class Veicolo {
    private double consumo; // litri per 100 Km

    public Veicolo(double c) throws Exception {
        if (c > 0.0 && c < 20.0)
            consumo = c;
        else
            throw new Exception("Parametro consumo errato");
    }

    public double getConsumo() {
        return consumo;
    }
}