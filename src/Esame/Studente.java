package Esame;

public class Studente {

    private String nome;
    private String cognome;
    private int matricola;
    private Esame[] esami;
    private int numEsami;

    public Studente(String nome, String cognome, int matricola) throws Exception {
        if (nome == null || cognome == null || nome.length() < 2 || cognome.length() < 2 || matricola <= 0) {
            throw new Exception("Dati dello studente non validi");
        }
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.esami = new Esame[30]; // Array di esami con dimensione iniziale (massimo 30)
        this.numEsami = 0;
    }

    public void aggiungiEsame(Esame e) throws Exception {
        if (numEsami >= 30) {
            throw new Exception("Numero massimo di esami raggiunto");
        }
        int totaleCfu = 0;
        for (int i = 0; i < numEsami; i++) {
            totaleCfu = totaleCfu + esami[i].getCfu();
        }
        if (totaleCfu > 180) {
            throw new Exception("CFU totali superano il limite di 180");
        }
        esami[numEsami] = e;
        numEsami++;
    }

    @Override
    public String toString() {
        String result = "Studente: " + nome + " " + cognome + ", Matricola: " + matricola + "\nEsami superati:\n";
        for (int i = 0; i < numEsami; i++) {
            if (esami[i].getVoto() >= 18) {
                result = result + "- " + esami[i].toString() + "\n";
            }
        }
        return result;
    }
}
