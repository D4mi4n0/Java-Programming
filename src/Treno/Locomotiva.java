package Treno;

public class Locomotiva extends Vagone {

    private int cavalli;

    public Locomotiva(int peso, int cavalli) throws Exception {
        super(peso);
        if (cavalli <= 0) {
            throw new Exception("Il numero di cavalli deve essere maggiore di zero.");
        }
        this.cavalli = cavalli;
    }

    public int getCavalli() {
        return cavalli;
    }

}
