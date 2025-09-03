package Rettangolo;

public class Main {
    public static void main(String[] args) {
        try {
            Rettangolo rettangolo = new Rettangolo(9, 3);
            System.out.println("Area: " + rettangolo.calcolaArea());
            System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());

            rettangolo.ridimensiona(7, 4);
            System.out.println("Nuova area: " + rettangolo.calcolaArea());
            System.out.println("Nuovo perimetro: " + rettangolo.calcolaPerimetro());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}