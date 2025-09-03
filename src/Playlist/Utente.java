package Playlist;

public class Utente {
    private String nome;
    private Canzone[][] playlist = new Canzone[10][];
    private int numPlaylist = 0;

    public Utente(String nome) {
        this.nome = nome;
    }

    public void creaPlaylist(Canzone... canzoni) {
        if (numPlaylist >= playlist.length) {
            System.out.println("Limite playlist raggiunto");
        }
        // Si crea una nuova playlist (oggetto) contenente un array di canzoni
        playlist[numPlaylist] = new Canzone[canzoni.length];
        // Si copiano le canzoni nella nuova playlist
        for (int i = 0; i < canzoni.length; i++) {
            playlist[numPlaylist][i] = canzoni[i];
        }
        // Si incrementa il numero di playlist
        numPlaylist++;
    }

    public void stampaLibreria() {
        System.out.println("Libreria di " + nome + ":");
        for (int i = 0; i < numPlaylist; i++) {
            System.out.println("Playlist " + (i + 1) + ":");
            for (int j = 0; j < playlist[i].length; j++) {
                System.out.println("  " + playlist[i][j]);
            }
        }
    }

}