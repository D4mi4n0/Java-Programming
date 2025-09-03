package Biblioteca;

public class Main {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca(5);

        biblioteca.aggiungiElemento(new Libro("1", "Il Signore degli Anelli", 1954, "Tolkien", 1000));
        biblioteca.aggiungiElemento(new DVD("2", "Il Signore degli Anelli", 1954, "Tolkien", 1000));

        biblioteca.stampaTuttiGliItem();
    }
}