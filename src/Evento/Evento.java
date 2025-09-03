/*
La classe Evento permette la creazione di manifestazioni 
fornendo la data. La data e' indicata con l'anno, che ha un 
valore intero maggiore o uguale a 2020, e il giorno definito
come il numero di giorni a partire dal primo gennaio.

Definire la classe Concerto che estende la classe Evento con 
il numero massimo dei posti per l'evento e il nome dell'artista. 
Il numero massimo dei posti per ogni concerto non deve superare 
200, altrimenti il concerto non verrà creato e l'eccezione 
TroppiPostiException verrà lanciata. Definire quindi l'eccezione 
TroppiPostiException, facendo in modo che ogni qual volta viene 
istanziata si tenga traccia del numero di posti che hanno condotto 
alla sua istanziazione. 

Definire la classe Biglietto che produce i biglietti sia per 
generici eventi che per concerti (ogni oggetto della classe 
Biglietto dovrà quindi contenere un riferimento ad un oggetto 
corrispondente ad un generico evento oppure ad un concerto). 
Definire la classe Biglietto in modo tale che non più di 
1000 oggetti della classe possano essere creati. Ogni biglietto 
avrà un numero seriale generato in modo progressivo (cioe' interi 
da 1 a 1000). Riscrivere nella classe Biglietto il metodo 
toString per la stampa dei dati del biglietto.

NB: la classe Evento non puo' essere modificata in alcun modo!
*/

package Evento;

public class Evento {
    private int anno;
    private int giorno;

    Evento(int a, int g) throws Exception {
        if (a >= 2020 && g >= 1 && g <= 365) {
            anno = a;
            giorno = g;
        } else
            throw new Exception("Data errata");
    }

    public int getAnno() {
        return anno;
    }

    public int getGiorno() {
        return giorno;
    }

    @Override
    public String toString() {
        return "Generico evento del giorno "+giorno+
                " dell'anno "+anno;
    }
}