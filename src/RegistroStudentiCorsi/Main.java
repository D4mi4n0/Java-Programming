package RegistroStudentiCorsi;

public class Main {
    public static void main(String[] args) throws Exception {
        Studente s1 = new Studente("Francesco", "Bianchi", "FBCN00A01A", "123456", 3);
        Corso c1 = new Corso("Programmazione", "PRG", s1);
        s1.aggiungiCorso(c1);
        System.out.println(s1.getInfo());

        Studente s2 = new Studente("Maria", "Rossi", "MRSR00A01B", "654321", 3);
        Corso c2 = new Corso("Matematica", "MAT", s2);
        s2.aggiungiCorso(c2);
        System.out.println(s2.getInfo());
    }
}