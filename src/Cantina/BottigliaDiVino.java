package Cantina;

public class BottigliaDiVino {

    private String nome;
    private double gradoAlcolico;
    private int dimensione;

    public BottigliaDiVino(String nome, double gradoAlcolico, int dimensione) {
        if (nome == null || nome.isEmpty() || gradoAlcolico <= 0 || dimensione <= 0) {
            throw new IllegalArgumentException("Valori non validi");
        }
        this.nome = nome;
        this.gradoAlcolico = gradoAlcolico;
        this.dimensione = dimensione;
    }

    public String getNome() {
        return nome;
    }

    public double getGradoAlcolico() {
        return gradoAlcolico;
    }

    public int getDimensione() {
        return dimensione;
    }

}