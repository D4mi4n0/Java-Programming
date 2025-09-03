package RegistroStudentiCorsi;

public class Corso {

    private String nomeCorso;
    private String codiceCorso;
    private Persona docente;

    public Corso(String nomeCorso, String codiceCorso, Persona docente) throws Exception {
        if (nomeCorso == null || nomeCorso.isEmpty() || codiceCorso == null || codiceCorso.isEmpty() || docente.getInfo() == null || docente.getInfo().isEmpty()) {
            throw new Exception("Valori non validi per il corso");
        }
        this.nomeCorso = nomeCorso;
        this.codiceCorso = codiceCorso;
        this.docente = docente;
    }

    public String getInfo() {
        return "Corso: " + nomeCorso + ", Codice Corso: " + codiceCorso + ", Docente: " + docente.getInfo();
    }
}
