package Orario;

public class TestOrario {
    public static void main(String[] args) {
        Orario o1 = new Orario(10, 45, 60);
        Orario o2 = new Orario(3, 20, 40);

        if (o1.orarioValido() && o2.orarioValido()) {
            System.out.print("Orario 1: ");
            o1.stampaOrario();
            System.out.print("Orario 2: ");
            o2.stampaOrario();

            Orario somma = o1.somma(o2);
            System.out.print("Somma orari: ");
            somma.stampaOrario();
        } else {
            System.out.println("Uno degli orari non è valido.");
        }
    }
}