package Cantina;

public class Cantina {

    private BottigliaDiVino[] bottiglie;
    private int numeroBottiglie;

    public Cantina() {
        this.bottiglie = new BottigliaDiVino[1000];
        this.numeroBottiglie = 0;
    }

    public void aggiungiBottiglia(BottigliaDiVino bottiglia) {
        if (bottiglia == null || numeroBottiglie >= bottiglie.length) {
            throw new IllegalArgumentException("Valori non validi");
        }
        bottiglie[numeroBottiglie] = bottiglia;
        numeroBottiglie++;
    }

    public int numeroBottiglie(double alcMin, double alcMax) {
        int count = 0;
        // Itero sulle bottiglie
        // E conto quelle che hanno un grado alcolico compreso tra alcMin e alcMax
        for (int i = 0; i < numeroBottiglie; i++) {
            if (bottiglie[i].getGradoAlcolico() >= alcMin && bottiglie[i].getGradoAlcolico() <= alcMax) {
                count++;
            }
        }
        return count;
    }

    private double quantita(double alcMin, double alcMax) {
        double quantita = 0;
        // Itero sulle bottiglie
        // E sommo le dimensioni delle bottiglie che hanno un grado alcolico compreso tra alcMin e alcMax
        for (int i = 0; i < numeroBottiglie; i++) {
            if (bottiglie[i].getGradoAlcolico() >= alcMin && bottiglie[i].getGradoAlcolico() <= alcMax) {
                quantita = quantita + bottiglie[i].getDimensione();
            }
        }
        return quantita;
    }

    public double dimensioneMedia(double alcMin, double alcMax) {
        // Basta dividere la quantità e il numero di bottiglie
        // Per ricavare la dimensione media
        return quantita(alcMin, alcMax) / numeroBottiglie(alcMin, alcMax);
    }

}