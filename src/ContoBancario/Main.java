package ContoBancario;

public class Main {
    public static void main(String[] args) throws Exception {
        ContoBancario c1 = new ContoBancario("12345", "Francesco", 1000.0);
        c1.visualizzaDettagli();

        ContoBancario c2 = new ContoBancario("67890", "Maria", 500.0);
        c2.visualizzaDettagli();

        c1.deposita(200.0);
        c2.preleva(100.0);

        c1.visualizzaDettagli();
        c2.visualizzaDettagli();
    }
}
