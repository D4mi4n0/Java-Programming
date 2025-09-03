package Orario;

public class Orario {

    private int ore;
    private int minuti;
    private int secondi;

    public Orario(int ore, int minuti, int secondi) {
        this.ore = ore;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    public boolean orarioValido() {
        return ore >= 0 && ore < 24 &&
                minuti >= 0 && minuti < 60 &&
                secondi >= 0 && secondi < 60;
    }

    public void stampaOrario() {
        System.out.println(ore + ":" + minuti + ":" + secondi);
    }

    public Orario somma(Orario altro) {
        int s = this.secondi + altro.secondi;
        int m = this.minuti + altro.minuti + s / 60;
        int h = this.ore + altro.ore + m / 60;

        s = s % 60;
        m = m % 60;
        h = h % 24;

        return new Orario(h, m, s);
    }

}