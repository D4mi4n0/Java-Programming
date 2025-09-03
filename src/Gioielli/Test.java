package Gioielli;

public class Test {
    public static void main(String[] args) {
        try {
            Gioiello g = new Gioiello(5);

            Pietra p1 = new Pietra(10, 20);
            Pietra p2 = new Pietra(5, 15);
            Oro o1 = new Oro(8, 10);

            System.out.println(g.add(p1)); // true
            System.out.println(g.add(p2)); // true
            System.out.println(g.add(o1)); // true

            System.out.println("Carati pietre: " + g.caratiPietre()); // 35
            System.out.println("Check: " + g.check()); // true (35 > 10+5+8 = 23)

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}

