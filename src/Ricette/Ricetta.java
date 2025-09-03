package Ricette;

public class Ricetta {

    private int persone;
    private Ingrediente[] ingredienti;
    private int numeroIngredienti;

    public Ricetta(int persone, int maxIngredienti) {
        if (persone <= 0 || maxIngredienti <= 0) {
            throw new IllegalArgumentException("Il numero di persone e il numero massimo di ingredienti devono essere positivi.");
        }
        this.persone = persone;
        this.ingredienti = new Ingrediente[maxIngredienti];
        this.numeroIngredienti = 0;
    }

    public boolean add(Ingrediente i) {
        if (i == null || numeroIngredienti >= ingredienti.length) {
            return false;
        }
        for (int j = 0; j < numeroIngredienti; j++) {
            // Obbligatoriamente devo iterare tra gli ingredienti
            // Per verificare la presenza dell'ingrediente
            if (ingredienti[j].getNome().equals(i.getNome())) {
                return false; // L'ingrediente esiste già
            }
        }
        ingredienti[numeroIngredienti] = i;
        numeroIngredienti++;
        return true; // Ingredient aggiunto con successo
    }

    public double pesoPersona() {
        if (numeroIngredienti == 0) {
            return 0.0; // Nessun ingrediente, peso per persona è 0
        }
        double pesoTotale = 0.0;
        for (int i = 0; i < numeroIngredienti; i++) {
            pesoTotale = pesoTotale + ingredienti[i].getQuantita();
        }
        return pesoTotale / persone; // Peso totale diviso per il numero di persone
    }

    public Ingrediente ingredientePrincipale() {
        if (numeroIngredienti == 0) {
            return null; // Nessun ingrediente, non c'è un ingrediente principale
        }
        // Qua so già che c'è un ingrediente principale
        Ingrediente principale = ingredienti[0];
        for (int i = 1; i < numeroIngredienti; i++) {
            // Confronto le quantità degli ingredienti per trovare il principale
            if (ingredienti[i].getQuantita() > principale.getQuantita()) {
                principale = ingredienti[i]; // Trovo l'ingrediente con la quantità maggiore
            }
        }
        return principale; // Ritorno l'ingrediente principale
    }

}
