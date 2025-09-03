package Vaccini;

public abstract class Vaccino {

    protected int identificativo;
    protected String aziendaFarmaceutica;
    protected int durataRichiamo;

    public Vaccino(int identificativo, String aziendaFarmaceutica, int durataRichiamo) throws DatiErrati {
        if (durataRichiamo <= 10) {
            throw new DatiErrati("Durata non valida per il richiamo");
        }
        this.identificativo = identificativo;
        this.aziendaFarmaceutica = aziendaFarmaceutica;
        this.durataRichiamo = durataRichiamo;
    }

    public int getIdentificativo() {
        return identificativo;
    }

    public String getAziendaFarmaceutica() {
        return aziendaFarmaceutica;
    }

    public int getGiorniProssimaDose() {
        return durataRichiamo;
    }

}
