package Lampadina;

public class Main {
    public static void main(String[] args) {
        Lampadina lampadina = new Lampadina("spenta");

        for (int i = 1; i <= 7; i++) {
            lampadina.click();
            System.out.println("Click " + i + ": stato lampadina = " + lampadina.getStato());
        }
    }
}
