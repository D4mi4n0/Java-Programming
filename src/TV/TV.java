package TV;

public abstract class TV {

    private int pollici;
    protected String nomeModello;

    public TV(int pollici, String nomeModello) throws Exception {
        if (pollici <= 1) {
            throw new Exception("Dimensione TV errata!");
        }
        this.pollici = pollici;
    }

    public int getPollici() {
        return pollici;
    }

    public String getNomeModello() {
        return nomeModello;
    }

}
