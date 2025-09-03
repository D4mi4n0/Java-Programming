package Poligoni;

public class Main {
    public static void main(String[] args) {
        try {
            // Creazione di una figura con un massimo di 5 punti
            Figura figura = new Figura(5);

            // Creazione e aggiunta di punti
            Punto p1 = new Punto(1.0, 1.0);
            Punto p2 = new Punto(4.0, 1.0);
            Punto p3 = new Punto(4.0, 5.0);
            Punto p4 = new Punto(1.0, 5.0);

            figura.add(p1);
            figura.add(p2);
            figura.add(p3);
            figura.add(p4);
            figura.add(p1); // Chiude la figura

            // Calcolo e stampa del perimetro
            double perimetro = figura.perimetro();
            if (perimetro > 0.0) {
                System.out.println("Il perimetro della figura è: " + perimetro);
            } else {
                System.out.println("La figura non è chiusa o non è valida.");
            }
        } catch (Exception e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}