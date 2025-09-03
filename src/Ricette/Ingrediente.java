package Ricette;

public class Ingrediente {

    private String nome;
    private int quantita;

    public Ingrediente(String nome, int quantita) {
        if (nome == null || quantita <= 0) {
            throw new IllegalArgumentException("Il nome non può essere nullo e la quantità deve essere positiva.");
        }
        this.nome = nome;
        this.quantita = quantita;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantita() {
        return quantita;
    }

}