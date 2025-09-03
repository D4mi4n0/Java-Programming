package Gioielli;

public class Oro extends Prezioso {

    private int carati;

    public Oro(int peso, int carati) throws Exception {
        super(peso);
        if (carati < 8 || carati > 14) {
            throw new Exception("I carati devono essere compresi tra 8 e 14");
        }
        this.carati = carati;
    }

    @Override
    public int getCarati() {
        return carati;
    }

}
