package TV;

import java.util.Arrays;

public class Panasonic extends TV {

    private int[] frequenze;
    private int numCanali;
    private String risoluzione;

    public Panasonic(int pollici, String nomeModello, int numCanali, String risoluzione) throws Exception {
        super(pollici, nomeModello);
        if (numCanali <= 12) {
            throw new Exception("Numero di canali non può essere negativo!");
        }
        this.numCanali = numCanali;
        this.risoluzione = risoluzione;
        this.frequenze = new int[numCanali + 1]; // canali da 1 a numeroCanali
        for (int i = 0; i <= numCanali; i++) {
            frequenze[i] = -1; // -1 = non impostato
        }
    }

    public void setCanale(int canale, int frequenza) throws CanaliSovrapposti {
        if (canale <= 0 || canale > numCanali) {
            throw new IllegalArgumentException("Canale non valido.");
        }
        if (frequenza < 550 || frequenza > 790) {
            throw new IllegalArgumentException("Frequenza fuori intervallo.");
        }
        // Verifica sovrapposizione
        for (int i = 1; i <= numCanali; i++) {
            if (frequenze[i] == frequenza && i != canale) {
                throw new CanaliSovrapposti("Frequenza " + frequenza + " già assegnata al canale " + i);
            }
        }
        frequenze[canale] = frequenza;
    }

    @Override
    public String toString() {
        return "Panasonic{" +
                "risoluzione='" + risoluzione + '\'' +
                ", frequenze=" + Arrays.toString(frequenze) +
                ", numCanali=" + numCanali +
                ", nomeModello='" + nomeModello + '\'' +
                '}';
    }
}