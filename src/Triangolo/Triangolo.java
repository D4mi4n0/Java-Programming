package Triangolo;

import java.util.Scanner;

public class Triangolo {

    private double lato1;
    private double lato2;
    private double lato3;
    private double altezza;

    public Triangolo(double lato1, double lato2, double lato3, double altezza) throws Exception {
        if (lato1 < 0 || lato2 < 0 || lato3 < 0 || altezza < 0) {
            throw new Exception("I lati e l'altezza devono essere maggiori di zero.");
        }
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.altezza = altezza;
    }

    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }

    public double calcolaArea() {
        return (lato1 * altezza) / 2;
    }

    public void stampaInfo() {
        System.out.println("Il perimetro del triangolo e': " + calcolaPerimetro());
        System.out.println("L'area del triangolo e': " + calcolaArea());
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci il lato 1: ");
            double lato1 = scanner.nextDouble();
            System.out.println("Inserisci il lato 2: ");
            double lato2 = scanner.nextDouble();
            System.out.println("Inserisci il lato 3: ");
            double lato3 = scanner.nextDouble();
            System.out.println("Inserisci l'altezza: ");
            double altezza = scanner.nextDouble();
            Triangolo triangolo = new Triangolo(lato1, lato2, lato3, altezza);
            triangolo.stampaInfo();
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

}