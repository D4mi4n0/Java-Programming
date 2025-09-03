package Vaccini;

public class Main {
    public static void main(String[] args) {
        try {
            Persona p1 = new Persona("Giulia", 65, Persona.FEMMINILE);
            Vaccino dose1 = new VaccinoA(1, "Pfizer", 21);
            Vaccino dose2 = new VaccinoB(2, "Moderna", 30, "Intramuscolo");

            p1.eseguiDose(dose1);
            p1.eseguiDose(dose2);

            System.out.println(p1);
        } catch (DatiErrati | DosiNonSomministrabili e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}

