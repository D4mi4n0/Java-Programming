package Formaggi;

public class Grotta {

    private String nome;
    private Formaggio[] abitanti;
    private int numAbitanti;

    public Grotta(String nome, int numeroMassimoForme) throws Exception {
        if (nome == null || nome.length() < 2 || numeroMassimoForme < 0) {
            throw new Exception("Grotta non valida");
        }
        this.nome = nome;
        this.abitanti = new Formaggio[numeroMassimoForme];
        this.numAbitanti = 0;
    }

    public boolean aggiungiFormaggio(Formaggio p) {
        if (p == null) {
            return false;
        }
        for (int i = 0; i < numAbitanti; i++) {
            if (abitanti[i].equals(p)) {
                return false; // Formaggio già presente
            }
        }
        if (numAbitanti >= abitanti.length) {
            return false;
        }
        abitanti[numAbitanti] = p;
        numAbitanti++;
        return true;
    }

    public int stagionati() {
        if (numAbitanti == 0) {
            return 0; // Nessun formaggio presente
        }
        int risultato = 0;
        // Itero su tutti i formaggi per vedere se sono stati stagionati (data di fine stagionatura diversa da 0)
        for (int i = 0; i < numAbitanti; i++) {
            if ((abitanti[i].getDataDiProduzione() != 0)) {
                risultato++;
            }
        }
        return risultato;
    }

    public int prodotti(int anno) {
        if (numAbitanti == 0) {
            return 0; // Nessun formaggio presente
        }
        int risultato = 0;
        // Itero su tutti i formaggi per vedere se sono stati prodotti nell'anno specificato
        for (int i = 0; i < numAbitanti; i++) {
            long dataProduzione = abitanti[i].getDataDiProduzione();
            int annoProduzione = (int) (dataProduzione / 10000); // Estrae l'anno dalla data (diviso 10000, perché in formato AAAAMMGG)
            if (annoProduzione == anno) {
                risultato++;
            }
        }
        return risultato;
    }

    public double stagionaturaMedia() {
        if (numAbitanti == 0) {
            return 0.0; // Nessun formaggio presente
        }
        long sommaStagionatura = 0;
        int contatore = 0;
        // Itero su tutti i formaggi per calcolare la stagionatura media
        for (int i = 0; i < numAbitanti; i++) {
            long dataFineStagionatura = abitanti[i].getDataDiProduzione();
            if (dataFineStagionatura != 0) {
                sommaStagionatura = sommaStagionatura + dataFineStagionatura - abitanti[i].getDataDiProduzione();
                contatore++;
            }
        }
        return contatore == 0 ? 0.0 : (double) sommaStagionatura / contatore;
    }

}