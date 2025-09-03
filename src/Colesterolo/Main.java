package Colesterolo;

public class Main {
    public static void main(String[] args) {
        try {
            // Creazione di un oggetto Esami con un massimo di 5 esami
            Esami listaEsami = new Esami(5);

            // Creazione di alcuni esami
            Esame esame1 = new Esame(20230101, 50, 120, 150);
            Esame esame2 = new Esame(20230201, 55, 130, 200);
            Esame esame3 = new Esame(20230301, 60, 140, 180);

            // Aggiunta degli esami alla lista
            listaEsami.add(esame1);
            listaEsami.add(esame2);
            listaEsami.add(esame3);

            // Calcolo e stampa del massimo dei trigliceridi
            System.out.println("Trigliceridi massimi: " + listaEsami.trigliceridiMassimo());

            // Calcolo e stampa della media degli intervalli LDL-HDL
            System.out.println("Media intervalli LDL-HDL: " + listaEsami.mediaIntervalli());

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
