package Biblioteca;

public class Biblioteca {

    private ItemBiblioteca[] elencoElementi;
    private int numElementi;

    public Biblioteca(int maxElementi) throws Exception {
        if (maxElementi <= 0) {
            throw new Exception("Il numero massimo di elementi deve essere positivo.");
        }
        this.elencoElementi = new ItemBiblioteca[maxElementi];
        this.numElementi = 0;
    }

    public boolean aggiungiElemento(ItemBiblioteca elemento) {
        if (elemento == null || numElementi >= elencoElementi.length) {
            return false; // Non aggiunge se l'elemento è nullo o se la biblioteca è piena
        }
        elencoElementi[numElementi] = elemento;
        numElementi++;
        return true;
    }

    public void stampaTuttiGliItem() {
        if (numElementi == 0) {
            System.out.println("La biblioteca è vuota.");
            return;
        }
        for (int i = 0; i < numElementi; i++) {
            elencoElementi[i].stampaInfo();
            System.out.println("--------------------");
        }
    }

}