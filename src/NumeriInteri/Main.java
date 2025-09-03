package NumeriInteri;

public class Main {
    public static void main(String[] args) {
        try {
            // Creazione di due insiemi
            Insieme insieme1 = new Insieme(5);
            Insieme insieme2 = new Insieme(5);

            // Aggiunta di elementi al primo insieme
            insieme1.aggiungi(1);
            insieme1.aggiungi(2);
            insieme1.aggiungi(3);

            // Aggiunta di elementi al secondo insieme
            insieme2.aggiungi(3);
            insieme2.aggiungi(4);
            insieme2.aggiungi(5);

            // Stampa della dimensione degli insiemi
            System.out.println("Dimensione insieme1: " + insieme1.dimensione());
            System.out.println("Dimensione insieme2: " + insieme2.dimensione());

            // Verifica se un elemento è contenuto
            System.out.println("Insieme1 contiene 2? " + insieme1.contiene(2));
            System.out.println("Insieme2 contiene 2? " + insieme2.contiene(2));

            // Calcolo e stampa dell'intersezione
            Insieme intersezione = insieme1.intersezione(insieme2);
            System.out.println("Intersezione dimensione: " + intersezione.dimensione());

            // Calcolo e stampa della differenza
            Insieme differenza = insieme1.differenza(insieme2);
            System.out.println("Differenza dimensione: " + differenza.dimensione());
        } catch (Exception e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}
