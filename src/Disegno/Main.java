package Disegno;

public class Main {
    public static void main(String[] args) {
        Disegno disegno = new Disegno(100);

        Figura q1 = new Quadrato(5);         // Quadrato di lato 5
        Figura r1 = new Rettangolo(4, 6);    // Rettangolo 4x6
        Figura rombo1 = new Rombo(3, 4);     // Rombo con diagonali 3 e 4

        disegno.aggiungiFigura(q1);
        disegno.aggiungiFigura(r1);
        disegno.aggiungiFigura(rombo1);

        System.out.println(disegno);
    }
}