package Scacchi;

public class Main {
    public static void main(String[] args) {
        try {
            // Creazione di una scacchiera 8x8
            Scacchiera scacchiera = new Scacchiera(8);

            // Aggiunta di cavalli sulla scacchiera
            scacchiera.aggiungiPezzo(0, 0); // Cavallo in alto a sinistra
            scacchiera.aggiungiPezzo(4, 4); // Cavallo al centro

            // Verifica se una cella è dominata
            System.out.println("La cella (2, 1) è dominata: " + scacchiera.dominata(2, 1));
            System.out.println("La cella (3, 3) è dominata: " + scacchiera.dominata(3, 3));

            // Spostamento di un cavallo
            boolean spostato = scacchiera.sposta(0, 0, 2, 1);
            System.out.println("Cavallo spostato da (0, 0) a (2, 1): " + spostato);

            // Conta quanti cavalli possono raggiungere una cella
            int conta = scacchiera.conta(4, 4);
            System.out.println("Numero di cavalli che possono raggiungere (4, 4): " + conta);

        } catch (Exception e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}