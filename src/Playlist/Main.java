/*
Implementare un programma per la gestione delle playlist di un
utente della piattaforma Spotify. Ogni Utente può creare un massimo
di 10 playlist, ed ogni playlist può contenere un numero qualsiasi
di canzoni.
Una canzone deve avere un titolo compreso tra un carattere
e massimo 100, la durata (espressa in minuti) con un massimo di 30min
e una lista di artisti di cui il primo è l'autore della canzone mentre
il resto(se presenti) sono i featuring (specificati nella stampa
della canzone).
Implementare un metodo per la stampa dell'intera libreria musicale
dell'utente.
 */

package Playlist;

public class Main {
    public static void main(String[] args) {
        Canzone c1 = new Canzone("Dissing Pique",4,"Shakira");
        Canzone c2 = new Canzone("Rap God",5,"Eminem");
        Canzone c3 = new Canzone("Veleno",3,"Gemitaiz","Madman");
        Canzone c4 = new Canzone("Poligono regolare di 6 lati",5,"SALMO","Gemitaiz","Madman");
        Utente u1 = new Utente("Culmone");
        u1.creaPlaylist(c1,c2,c3,c4);
        u1.creaPlaylist(c4,c2);
        u1.stampaLibreria();
    }
}
