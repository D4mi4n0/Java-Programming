package Rami;

public class Main {
    public static void main(String[] args) {
        try {
            // Creazione del ramo principale
            Ramo ramoPrincipale = new Ramo(10.0f, 3);

            // Creazione di sotto-rami
            Ramo sottoRamo1 = new Ramo(5.0f, 2);
            Ramo sottoRamo2 = new Ramo(3.0f, 1);
            Ramo sottoRamo3 = new Ramo(2.0f, 0);

            // Aggiunta dei sotto-rami al ramo principale
            ramoPrincipale.add(sottoRamo1);
            ramoPrincipale.add(sottoRamo2);

            // Aggiunta di un sotto-ramo al sottoRamo1
            sottoRamo1.add(sottoRamo3);

            // Stampa della struttura del ramo principale
            System.out.println(ramoPrincipale);

            // Calcolo e stampa della lunghezza totale
            float lunghezzaTotale = ramoPrincipale.lunghezzaTotale();
            System.out.println("Lunghezza totale dell'albero: " + lunghezzaTotale);
        } catch (Exception e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}