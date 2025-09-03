package Sequenza;

public class Sequenza {

    private int[] elementi;

    public Sequenza(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("La dimensione deve essere maggiore di 0");
        }
        this.elementi = new int[n];
    }

    public int lunghezza() {
        return elementi.length;
    }

    public void set(int i, int a) {
        if (i < 0 || i >= elementi.length) {
            throw new IllegalArgumentException("Indice fuori dai limiti della sequenza");
        }
        // Assegno il valore di a all'elemento i-esimo
        elementi[i] = a;
    }

    public int get(int i) {
        if (i < 0 || i >= elementi.length) {
            throw new IllegalArgumentException("Indice fuori dai limiti della sequenza");
        }
        return elementi[i];
    }

    public void scambia(int i, int j) {
        if (i < 0 || j < 0 || i >= elementi.length || j >= elementi.length) {
            throw new IllegalArgumentException("Indice fuori dai limiti della sequenza");
        }
        int temp = elementi[i];
        elementi[i] = elementi[j];
        elementi[j] = temp;
    }

    public boolean ordinata() {
        // Itero dal primo all'ultimo elemento
        // E se c'è un elemento maggiore del successivo, la sequenza non è ordinata
        for (int i = 0; i < elementi.length - 1; i++) {
            if (elementi[i] > elementi[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public int grado() {
        int grado = 0;
        // Itero su titti gli elementi
        // E se trovo un elemento maggiore del grado, aggiorno il grado
        for (int i = 0; i < elementi.length; i++) {
            if (elementi[i] > grado) {
                grado = elementi[i];
            }
        }
        return grado;
    }

}