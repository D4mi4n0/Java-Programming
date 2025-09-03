package Treno;

public class Carrozza extends Vagone {

    private int posti;

    public Carrozza(int peso, int posti) throws Exception {
        super(peso);
        if (posti < 40 || posti > 200) {
            throw new Exception("Il numero di posti deve essere compreso tra 40 e 200.");
        }
        this.posti = posti;
    }

    public int getPosti() {
        return posti;
    }

}
