package Scacchi;

public class Scacchiera {
    private final int n;
    private final boolean[][] scacchiera;

    // Costruttore
    public Scacchiera(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("La dimensione deve essere maggiore di zero.");
        }
        this.n = n;
        this.scacchiera = new boolean[n][n];
    }

    // Restituisce la dimensione della scacchiera
    public int dimensione() {
        return n;
    }

    // Controlla se la cella (i, j) contiene un pezzo
    public boolean contienePezzo(int i, int j) {
        if (!valida(i, j)) {
            return false;
        }
        return scacchiera[i][j];
    }

    // Aggiunge un cavallo nella cella (i, j)
    public boolean aggiungiPezzo(int i, int j) {
        if (!valida(i, j) || scacchiera[i][j]) {
            return false;
        }
        scacchiera[i][j] = true;
        return true;
    }

    // Verifica se la mossa del cavallo da (i, j) a (k, w) è valida
    public boolean mossaValida(int i, int j, int k, int w) {
        if (!valida(i, j) || !valida(k, w)) {
            return false;
        }
        if (!scacchiera[i][j] || scacchiera[k][w]) {
            return false;
        }
        // Calcolo della distanza tra le due posizioni
        int dx = Math.abs(i - k);
        int dy = Math.abs(j - w);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }

    // Verifica se la cella (i, j) è dominata da almeno un cavallo
    public boolean dominata(int i, int j) {
        if (!valida(i, j) || scacchiera[i][j]) {
            return false;
        }
        // Controlla tutte le celle che possono raggiungere (i, j) con una mossa da cavallo
        int[][] mosse = {{-2,-1}, {-2,1}, {-1,-2}, {-1,2}, {1,-2}, {1,2}, {2,-1}, {2,1}};
        for (int[] m : mosse) {
            // Calcola la posizione del cavallo
            int x = i + m[0];
            int y = j + m[1];
            if (valida(x, y) && scacchiera[x][y]) {
                return true;
            }
        }
        return false;
    }

    // Sposta un pezzo da (i, j) a (k, w)
    public boolean sposta(int i, int j, int k, int w) {
        if (mossaValida(i, j, k, w)) {
            // Ci spostiamo da i,j (true --> false) e andiamo in k,w (false --> true)
            scacchiera[i][j] = false;
            scacchiera[k][w] = true;
            return true;
        }
        return false;
    }

    // Conta quanti pezzi possono spostarsi in (i, j) con una mossa
    public int conta(int i, int j) {
        if (!valida(i, j)) {
            return 0;
        }
        // Vale lo stesso concetto del metodo dominata(), ma qui contiamo tutti i cavalli che possono raggiungere (i, j)
        int count = 0;
        int[][] mosse = {{-2,-1}, {-2,1}, {-1,-2}, {-1,2}, {1,-2}, {1,2}, {2,-1}, {2,1}};
        for (int[] m : mosse) {
            int x = i + m[0];
            int y = j + m[1];
            if (valida(x, y) && scacchiera[x][y] && !scacchiera[i][j]) {
                count++;
            }
        }
        return count;
    }

    // Metodo di utilità per verificare se una posizione è valida
    private boolean valida(int i, int j) {
        return i >= 0 && i < n && j >= 0 && j < n;
    }
}