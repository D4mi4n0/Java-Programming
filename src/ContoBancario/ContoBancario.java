package ContoBancario;

public class ContoBancario {

    private String numeroConto;
    private String titolare;
    private double saldo;

    public ContoBancario(String numeroConto, String titolare, double saldo) throws Exception {
        if (numeroConto == null || numeroConto.isEmpty() || titolare == null || titolare.isEmpty()) {
            throw new Exception("Il numero di conto e/o il titolare non possono essere nulli o vuoti.");
        }
        this.numeroConto = numeroConto;
        this.titolare = titolare;
        this.saldo = saldo;
    }

    public void deposita(double importo) {
        if (saldo == 0.0) {
            System.out.println("Il saldo è zero, non è possibile effettuare un deposito.");
            return;
        }
        saldo = saldo + importo;
    }

    public void preleva(double importo) {
        if (importo <= 0) {
            System.out.println("L'importo da prelevare deve essere maggiore di zero.");
        }
        if (saldo < importo) {
            System.out.println("Saldo insufficiente per il prelievo.");
        }
        saldo = saldo - importo;
    }

    public void visualizzaDettagli() {
        System.out.println("Numero di conto: " + numeroConto);
        System.out.println("Titolare: " + titolare);
        System.out.println("Saldo: " + saldo);
        System.out.println("-----------------------------");
    }

}