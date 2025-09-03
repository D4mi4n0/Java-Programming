package TV;

public class TestTV {
    public static void main(String[] args) {
        try {
            Panasonic tv = new Panasonic(42, "TX-42A", 15, "Full-HD");

            tv.setCanale(1, 714);
            tv.setCanale(2, 720);
            tv.setCanale(8, 790);

            // tv.setCanale(3, 714); // ← Questo lancerebbe CanaliSovrapposti

            System.out.println(tv.toString());

        } catch (CanaliSovrapposti e) {
            System.out.println("Errore: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore generale: " + e.getMessage());
        }
    }
}
