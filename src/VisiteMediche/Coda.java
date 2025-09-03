package VisiteMediche;

public class Coda {

    private Visita[] visite;
    private int numVisite;

    public Coda(int maxVisite) throws Exception {
        if (maxVisite < 0) {
            throw new Exception("Il numero massimo di visite deve essere un numero positivo.");
        }
        this.visite = new Visita[maxVisite];
        this.numVisite = 0;
    }

    public boolean inserimento(Visita v) {
        if (v == null || numVisite > visite.length) {
            return false;
        }
        visite[numVisite] = v;
        numVisite++;
        return true;
    }

    public Visita estrazione() {
        if (numVisite == 0) {
            return null;
        }
        Visita v = visite[0];
        for (int i = 1; i < numVisite; i++) {
            visite[i - 1] = visite[i];
        }
        numVisite--;
        return v;
    }

    public boolean cancellazione(String nome, String cognome) {
        if (nome == null || cognome == null || numVisite == 0) {
            return false;
        }
        for (int i = 0; i < numVisite; i++) {
            if (visite[i].getNome().equals(nome) && visite[i].getCognome().equals(cognome)) {
                // Se viene trovato quel paziente con quei nome e cognome,
                // viene rimosso dalla coda e viene aggiunto all'array dei cancellati
                for (int j = i; j < numVisite - 1; j++) {
                    visite[j] = visite[j + 1];
                }
                // Decrementa di 1 il numero di visite
                numVisite--;
                return true;
            }
        }
        return false;
    }

}
