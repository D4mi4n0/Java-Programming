package Task;

public class Task {

    private int progetto;
    private double durata;
    private String descrizione;
    private int id;

    public Task(int progetto, double durata, String descrizione, int id) {
        if (progetto <= 0 || durata <= 0 || descrizione == null || descrizione.length() <= 0) {
            throw new IllegalArgumentException("I parametri non possono essere nulli o negativi");
        }
        this.progetto = progetto;
        this.durata = durata;
        this.descrizione = descrizione;
        this.id = id;
    }

    public int getProgetto() {
        return progetto;
    }

    public double getDurata() {
        return durata;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getId() {
        return id;
    }

}