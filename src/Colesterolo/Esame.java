package Colesterolo;

public class Esame {

    private long data;
    private int hdl;
    private int ldl;
    private int trigliceridi;

    public Esame(long data, int hdl, int ldl, int trigliceridi) throws Exception {
        if (data <= 0 || hdl >= 500 || ldl >= 500 || hdl >= ldl || trigliceridi < 0 || trigliceridi > 600) {
            throw new Exception("Valori non validi per l'esame del colesterolo");
        }
        this.data = data;
        this.hdl = hdl;
        this.ldl = ldl;
        this.trigliceridi = trigliceridi;
    }

    public long getData() {
        return data;
    }

    public int getHdl() {
        return hdl;
    }

    public int getLdl() {
        return ldl;
    }

    public int getTrigliceridi() {
        return trigliceridi;
    }

}
