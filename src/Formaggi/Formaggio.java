package Formaggi;

public class Formaggio {

    private String nome;
    private int seriale;
    private long dataDiProduzione;
    private long dataDiFineStagionatura;

    public Formaggio(String nome, int seriale, long produzione) throws Exception {
        if (nome == null || nome.length() < 2 || seriale < 0 || !controllaData(produzione)) {
            throw new Exception("Formaggio non valido");
        }
        this.nome = nome;
        this.seriale = seriale;
        this.dataDiProduzione = produzione;
    }

    private static boolean controllaData(long data) {
        String s = String.valueOf(data);
        if (s.length() != 8) {
            return false;
        }
        int anno = Integer.parseInt(s.substring(0, 4));
        int mese = Integer.parseInt(s.substring(4, 6));
        int giorno = Integer.parseInt(s.substring(6, 8));
        return anno >= 1900 && mese >= 1 && mese <= 12 && giorno >= 1 && giorno <= 31;
    }

    public boolean stagionato(long dataDiFineStagionatura) {
        if (dataDiFineStagionatura <= this.dataDiProduzione || !controllaData(dataDiFineStagionatura)) {
            return false;
        }
        this.dataDiFineStagionatura = dataDiFineStagionatura;
        return true;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Formaggio)) {
            return false;
        }
        Formaggio that = (Formaggio) o;
        return seriale == that.seriale &&
               dataDiProduzione == that.dataDiProduzione &&
               nome.equals(that.nome) &&
               dataDiFineStagionatura == that.dataDiFineStagionatura;
    }

    public String getNome() {
        return nome;
    }

    public int getSeriale() {
        return seriale;
    }

    public long getDataDiProduzione() {
        return dataDiProduzione;
    }

    public long getDataDiFineStagionatura() {
        return dataDiFineStagionatura;
    }

}