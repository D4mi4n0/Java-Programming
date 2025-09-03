package Pacco;

public class Main {
    public static void main(String[] args) {
        ZatteraGalleggiante zattera = new ZatteraGalleggiante(10, 20);

        Pacco p1 = new Pacco(5.0);
        Pacco p2 = new Pacco(3.0);
        Pacco p3 = new Pacco(2.0);

        Punto pos1 = new Punto(2, 3);
        Punto pos2 = new Punto(5, 7);
        Punto pos3 = new Punto(10, 1);

        zattera.aggiungiPacco(p1, pos1);
        zattera.aggiungiPacco(p2, pos2);
        zattera.aggiungiPacco(p3, pos3);

        System.out.println("Peso totale: " + zattera.getPesoTotale());
        System.out.println("Peso medio: " + zattera.getPesoMedio());
        Punto baricentro = zattera.getBaricentro();
        System.out.println("Baricentro: (" + baricentro.getX() + ", " + baricentro.getY() + ")");
    }
}
