//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Book b1 = new Book("Carte1", "Autor1");
        Book b2 = new Book("Carte2", "Autor2");

        BookRegistry.register("B1", b1);
        BookRegistry.register("B2", b2);
        //BookRegistry.register("B2", b1);

        Book carteGasita = BookRegistry.getBook("B1");

        System.out.println(carteGasita.getTitle());
        System.out.println(carteGasita.getAuthor());
    }
}