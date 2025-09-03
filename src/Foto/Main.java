package Foto;

public class Main {
    public static void main(String[] args) {
        try {
            // Creazione di due foto con dimensione 5x5
            Foto foto1 = new Foto(5);
            Foto foto2 = new Foto(5);

            // Impostazione dei pixel per foto1
            for (int i = 0; i < foto1.getDimensione(); i++) {
                for (int j = 0; j < foto1.getDimensione(); j++) {
                    foto1.setPixel(i, j, i + j + 1); // Valori arbitrari
                }
            }

            // Impostazione dei pixel per foto2
            for (int i = 0; i < foto2.getDimensione(); i++) {
                for (int j = 0; j < foto2.getDimensione(); j++) {
                    foto2.setPixel(i, j, (i + 1) * (j + 1)); // Valori arbitrari
                }
            }

            // Sottrazione delle due foto
            Foto risultato = foto1.sub(foto2);

            // Stampa dei pixel della foto risultante
            System.out.println("Foto risultante dalla sottrazione:");
            for (int i = 0; i < risultato.getDimensione(); i++) {
                for (int j = 0; j < risultato.getDimensione(); j++) {
                    System.out.print(risultato.getPixel(i, j) + " ");
                }
                System.out.println();
            }

            // Calcolo del focus su un'area specifica
            int sommaFocus = foto1.focus(2, 2, 1); // Centro (2,2) con raggio 1
            System.out.println("Somma dei pixel nell'area di focus: " + sommaFocus);

        } catch (Exception e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}