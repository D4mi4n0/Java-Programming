package Vaccini;

import java.util.Arrays;

public class Persona {

    public static final int MASCHILE = 0;
    public static final int FEMMINILE = 1;

    private String nome;
    private int eta;
    private int sesso;
    private Vaccino[] vaccini;
    private int numVaccini;

    public Persona(String nome, int eta, int sesso) throws DatiErrati {
        if (nome.length() < 2 || eta < 0 || eta > 99 || (sesso != MASCHILE && sesso != FEMMINILE)) {
            throw new DatiErrati("Dati non validi per la persona");
        }
        this.nome = nome;
        this.eta = eta;
        this.sesso = sesso;
        this.vaccini = new Vaccino[100]; // Array di vaccini con dimensione fissa
        this.numVaccini = 0;
    }

    public void eseguiDose(Vaccino dose) throws DosiNonSomministrabili {
        if (numVaccini >= vaccini.length) {
            return;
        }
        if (dose instanceof VaccinoA) {
            if (eta < 14) {
                throw new DosiNonSomministrabili("Vaccino A non valido per persone minori di 14 anni.");
            }
        } else if (dose instanceof VaccinoB) {
            if (sesso == MASCHILE && eta < 18 || sesso == FEMMINILE && eta < 60) {
                throw new DosiNonSomministrabili("Vaccino B orale non somministrabile a uomini.");
            }
        }
        vaccini[numVaccini] = dose;
        numVaccini++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", eta=").append(eta);
        sb.append(", sesso=").append(sesso);
        sb.append(", vaccini=").append(Arrays.toString(vaccini));
        sb.append(", numVaccini=").append(numVaccini);
        sb.append('}');
        return sb.toString();
    }

}