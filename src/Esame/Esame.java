package Esame;

public class Esame {

    private String nome;
    private int cfu;
    private int voto;
    private int data;

    public Esame(String nome, int cfu) throws Exception {
        if (nome == null || nome.length() < 2 || cfu < 1 || cfu > 18) {
            throw new Exception("Dati dell'esame non validi.");
        }
        this.nome = nome;
        this.cfu = cfu;
    }

    public void esameSostenuto(int voto, int data) throws Exception {
        if (voto < 18 || voto > 30 || data <= 20200000) {
            throw new Exception("Voto o data non validi.");
        }
        this.voto = voto;
        this.data = data;
    }

    public int getCfu() {
        return this.cfu;
    }

    public String getNome() {
        return this.nome;
    }

    public int getVoto() {
        return this.voto;
    }

}
