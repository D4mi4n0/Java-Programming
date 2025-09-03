package VisiteMediche;

public class Visita {

    private String nome;
    private String cognome;

    public Visita(String nome, String cognome) throws Exception {
        if (nome == null || cognome == null || nome.length() < 2 || cognome.length() < 2) {
            throw new Exception("Nome e cognome devono essere di almeno 2 caratteri.");
        }
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

}
