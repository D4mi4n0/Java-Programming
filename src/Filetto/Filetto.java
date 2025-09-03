package Filetto;

public class Filetto {

    private char[][] griglia;
    private int dimensione;

    public Filetto(int n) {
        this.dimensione = n;
        if (n < 3) {
            throw new IllegalArgumentException("La dimensione del filetto deve essere maggiore di 2.");
        }
        griglia = new char[n][n];
        // Setto la griglia n x n
        // E setto una cella vuota
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                griglia[i][j] = ' ';
            }
        }
    }

    public boolean gioca(int i, int j, char c) {
        // Piazzo la pedina c a i,j
        if (dimensione <= i && i <= 0 && dimensione <= j && j <= 0 && griglia[i][j] != ' ') {
            return false;
        }
        griglia[i][j] = 'c';
        return true;
    }

    public boolean vinceRiga(int i, char c) {
        // Guardo se la riga i contiene solo c
        if (i < 0 || i >= dimensione) {
            return false;
        }
        for (int j = 0; j < dimensione; j++) {
            if (griglia[i][j] != 'c') {
                return false;
            }
        }
        return true;
    }

    public boolean vinceColonna(int j, char c) {
        // Guardo se la colonna j contiene solo c
        if (j < 0 || j >= dimensione) {
            return false;
        }
        for (int i = 0; i < dimensione; i++) {
            if (griglia[i][j] != 'c') {
                return false;
            }
        }
        return true;
    }

    public boolean vinceDiagonale(char c) {
        // Setto due diagonali
        boolean diagonale1 = true;
        boolean diagonale2 = true;
        // Controllo se le due diagonali sono state vinte
        for (int i = 0; i < dimensione; i++) {
            if (griglia[i][i] != 'c') {
                diagonale1 = false;
            }
            if (griglia[i][dimensione - 1 - i] != 'c') {
                diagonale2 = false;
            }
        }
        // Vince una diagonale o l'altra
        return diagonale1 || diagonale2;
    }

    public boolean vince(char c) {
        // Vince se vince una riga, una colonna o una diagonale (richiamo i 3 metodi)
        for (int i = 0; i < dimensione; i++) {
            if (vinceRiga(i, c)) {
                return true;
            }
        }
        for (int j = 0; j < dimensione; j++) {
            if (vinceColonna(j, c)) {
                return true;
            }
        }
        if (vinceDiagonale(c)) {
            return true;
        }
        return false;
    }

}