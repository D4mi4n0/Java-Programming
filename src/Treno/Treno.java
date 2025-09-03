package Treno;

public class Treno {

    public Vagone[] vagoni;
    public int numVagoni;

    public Treno(int maxVagoni) {
        if (maxVagoni < 1) {
            throw new IllegalArgumentException("Il numero massimo di vagoni deve essere maggiore o uguale a uno");
        }
        this.vagoni = new Vagone[maxVagoni];
        this.numVagoni = 0;
    }

    public boolean add(Vagone v) {
        if (v == null || numVagoni >= vagoni.length) {
            return false; // Treno pieno
        }
        vagoni[numVagoni] = v;
        numVagoni++;
        return true; // Vagone aggiunto con successo
    }

    public boolean check() {
        int sommaCavalliLocomotive = 0;
        int pesoTotale = 0;
        for (int i = 0; i < numVagoni; i++) {
            pesoTotale = pesoTotale + vagoni[i].getPeso();
            if (vagoni[i] instanceof Locomotiva) {
                sommaCavalliLocomotive = sommaCavalliLocomotive + ((Locomotiva) vagoni[i]).getCavalli();
            }
        }
        return sommaCavalliLocomotive > pesoTotale;
    }

    public int passeggeri() {
        int sommaPostiCarrozza = 0;
        for (int i = 0; i < numVagoni; i++) {
            if (vagoni[i] instanceof Carrozza) {
                sommaPostiCarrozza = sommaPostiCarrozza + ((Carrozza) vagoni[i]).getPosti();
            }
        }
        return sommaPostiCarrozza;
    }

}
