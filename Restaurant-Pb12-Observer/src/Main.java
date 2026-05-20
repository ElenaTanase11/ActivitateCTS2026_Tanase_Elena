//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Casa Buna");

        ClientFidel client1 = new ClientFidel("Ana");
        ClientFidel client2 = new ClientFidel("Ion");
        ClientFidel client3 = new ClientFidel("Maria");

        restaurant.adaugaObserver(client1);
        restaurant.adaugaObserver(client2);
        restaurant.adaugaObserver(client3);

        restaurant.adaugaOferta("20% reducere la meniul zilei");

        System.out.println("----------");

        restaurant.stergeObserver(client2);

        restaurant.adaugaMeniuNou("Meniu vegetarian");
    }
}