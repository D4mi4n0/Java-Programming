package Foto;

public class Foto {

    private int[][] pixel;

    // n: dimensione foto (pixel X pixel ---> n X n)
    public Foto(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("La dimensione della foto deve essere maggiore di zero.");
        }
        this.pixel = new int[n][n];
    }

    public int getDimensione() {
        return pixel.length;
    }

    public int getPixel(int i, int j) {
        if (i < 0 || j < 0 || i >= pixel.length || j >= pixel.length) {
            throw new IllegalArgumentException("Valori fuori dai limiti della foto.");
        }
        return pixel[i][j];
    }

    public boolean setPixel(int i, int j, int v) {
        if (i < 0 || j < 0 || i >= pixel.length || j >= pixel.length || v <= 0) {
            throw new IllegalArgumentException("Valori fuori dai limiti della foto.");
        }
        pixel[i][j] = v;
        return true;
    }

    public Foto sub(Foto a) { // per 'sub' intendiamo 'subtraction'
        if (a == null || a.getDimensione() != this.getDimensione()) {
            throw new IllegalArgumentException("Le dimensioni delle foto devono essere uguali.");
        }
        // Prepariamo le nuove dimensioni della foto risultante
        Foto risultato = new Foto(getDimensione());
        // Itero sul lato i
        for (int i = 0; i < getDimensione(); i++) {
            // E quindi sul lato j contemporaneamente
            for (int j = 0; j < getDimensione(); j++) {
                // Sottraggo i pixel delle due foto
                risultato.setPixel(i, j, this.getPixel(i, j) - a.getPixel(i, j));
            }
        }
        return risultato;
    }

    public int focus(int r, int c, int k) {
        // Il metodo focus() serve a calcolare la somma dei pixel all'interno di un quadrato
        // n sta per dimensione
        int n = getDimensione();
        // r sta per riga, quindi troviamo inizio e fine
        int inizioRiga = r - k;
        int fineRiga = r + k;
        // c sta per colonna, quindi troviamo inizio e fine
        int inizioCol = c - k;
        int fineCol = c + k;
        // Se i valori sono fuori dai limiti dell'immagine, lanciamo un'eccezione
        if (inizioRiga < 0 || fineRiga >= n || inizioCol < 0 || fineCol >= n) {
            throw new IllegalArgumentException("Il quadrato è fuori immagine");
        }
        // Itero sulle righe e sulle colonne contemporaneamente
        int somma = 0;
        for (int i = inizioRiga; i <= fineRiga; i++) {
            for (int j = inizioCol; j <= fineCol; j++) {
                // Sommo i pixel della foto
                somma = somma + pixel[i][j];
            }
        }
        return somma;
    }

}