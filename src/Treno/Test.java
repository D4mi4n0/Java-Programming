package Treno;

public class Test {
    public static void main(String[] args) {
        try {
            // Creazione del treno con capacità massima di 5 vagoni
            Treno treno = new Treno(5);

            // Creazione di locomotive e carrozze valide
            Locomotiva loco1 = new Locomotiva(50, 100);
            Locomotiva loco2 = new Locomotiva(60, 120);
            Carrozza car1 = new Carrozza(30, 100);
            Carrozza car2 = new Carrozza(40, 150);

            // Aggiunta dei vagoni al treno
            System.out.println("Aggiunta loco1: " + treno.add(loco1)); // true
            System.out.println("Aggiunta car1: " + treno.add(car1));   // true
            System.out.println("Aggiunta car2: " + treno.add(car2));   // true
            System.out.println("Aggiunta loco2: " + treno.add(loco2)); // true

            // Verifica della potenza
            System.out.println("Check potenza sufficiente: " + treno.check()); // true

            // Calcolo dei passeggeri
            System.out.println("Totale passeggeri: " + treno.passeggeri()); // 250

            // Test con parametri errati
            try {
                Locomotiva locoErrata = new Locomotiva(40, -10);
            } catch (Exception e) {
                System.out.println("Errore creazione locomotiva: " + e.getMessage());
            }

            try {
                Carrozza carErrata = new Carrozza(20, 300);
            } catch (Exception e) {
                System.out.println("Errore creazione carrozza: " + e.getMessage());
            }

            try {
                Treno trenoErrato = new Treno(0);
            } catch (Exception e) {
                System.out.println("Errore creazione treno: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Errore generale: " + e.getMessage());
        }
    }
}

