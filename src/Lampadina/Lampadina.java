package Lampadina;

public class Lampadina {

    private String stato;
    private int numClick;

    public Lampadina(String stato) {
        this.stato = "spenta";
        this.numClick = 0;
    }

    public void click() {
        if (stato.equals("rotta")) {
            System.out.println("Lampadina rotta, non si può accendere!");
            return;
        }
        numClick++;
        if (numClick > 5) {
            stato = "rotta";
        } else {
            if (stato.equals("spenta")) {
                stato = "accesa";
            } else if (stato.equals("accesa")) {
                stato = "spenta";
            }
        }
    }

    public String getStato() {
        return stato;
    }

}