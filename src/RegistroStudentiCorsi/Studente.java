package RegistroStudentiCorsi;

public class Studente extends Persona {

    private String matricola;
    private Corso[] corsiIscritti;
    private int numCorsiIscritti;

    public Studente(String nome, String cognome, String codiceFiscale, String matricola, int maxCorsiIscritti) throws Exception {
        super(nome, cognome, codiceFiscale);
        if (matricola == null || matricola.isEmpty() || maxCorsiIscritti <= 0) {
            throw new Exception("La matricola non può essere vuota");
        }
        this.matricola = matricola;
        this.corsiIscritti = new Corso[maxCorsiIscritti];
        this.numCorsiIscritti = 0;
    }

    public boolean aggiungiCorso(Corso corso) {
        if (corso == null || numCorsiIscritti >= corsiIscritti.length) {
            return false;
        }
        corsiIscritti[numCorsiIscritti] = corso;
        numCorsiIscritti++;
        return true;
    }

    public void stampaCorsiIscritti() {
        for (int i = 0; i < numCorsiIscritti; i++) {
            System.out.println(corsiIscritti[i].getInfo());
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Matricola: " + matricola;
    }

}