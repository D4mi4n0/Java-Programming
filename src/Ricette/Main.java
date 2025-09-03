package Ricette;

public class Main {
    public static void main(String[] args) {
        try {
            // Creazione di una ricetta per 4 persone con un massimo di 5 ingredienti
            Ricetta ricetta = new Ricetta(4, 5);

            // Creazione e aggiunta di ingredienti
            Ingrediente i1 = new Ingrediente("Farina", 500);
            Ingrediente i2 = new Ingrediente("Zucchero", 200);
            Ingrediente i3 = new Ingrediente("Burro", 250);

            ricetta.add(i1);
            ricetta.add(i2);
            ricetta.add(i3);

            // Stampa del peso per persona
            System.out.println("Peso per persona: " + ricetta.pesoPersona() + " grammi");

            // Stampa dell'ingrediente principale
            Ingrediente principale = ricetta.ingredientePrincipale();
            if (principale != null) {
                System.out.println("Ingrediente principale: " + principale.getNome() + " (" + principale.getQuantita() + " grammi)");
            } else {
                System.out.println("Nessun ingrediente principale.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}
