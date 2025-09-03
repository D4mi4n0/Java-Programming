package Vaccini;

public class VaccinoB extends Vaccino {

    private String modalitàSomministrazione;

    public VaccinoB(int identificativo, String aziendaFarmaceutica, int durataRichiamo, String modalitàSomministrazione) throws DatiErrati {
        super(identificativo, aziendaFarmaceutica, durataRichiamo);
        if (modalitàSomministrazione == null || modalitàSomministrazione.isEmpty()) {
            throw new DatiErrati("Modalità somministrazione non valida");
        }
        this.modalitàSomministrazione = modalitàSomministrazione;
    }

    public String getModalitàSomministrazione() {
        return modalitàSomministrazione;
    }

}
