package Gioielli;

public class Pietra extends Prezioso {

    private int carati;

    public Pietra(int peso, int carati) throws Exception {
        super(peso);
        if (carati <= 0) {
            throw new Exception("I carati devono essere maggiori di zero");
        }
        this.carati = carati;
    }

    @Override
    public int getCarati() {
        return carati;
    }

}
