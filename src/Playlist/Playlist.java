package Playlist;

public class Playlist {

    private Canzone[] canzoni;
    private int numCanzoni;

    public Playlist(int maxCanzoni) {
        this.canzoni = new Canzone[maxCanzoni];
        this.numCanzoni = 0;
    }

    public void addCanzone(Canzone c) throws Exception {
        if (c == null || numCanzoni >= canzoni.length) {
            throw new Exception("Valori non validi");
        }
        canzoni[numCanzoni] = c;
        numCanzoni++;
    }

    public void stampaPlaylist() {
        for (int i = 0; i < numCanzoni; i++) {
            System.out.println(canzoni[i]);
        }
    }

}