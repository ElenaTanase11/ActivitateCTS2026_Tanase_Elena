public class RestaurantProxy implements IRezervare{

    private Restaurant restaurant;

    public RestaurantProxy(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void rezervaMasa(int numarPersoane) {
        if (numarPersoane >= 4) {
            restaurant.rezervaMasa(numarPersoane);
        }
        else {
            System.out.println("Rezervarea nu se poate realiza pentru mai putin de 4 persoane. " + "Va rugam sa va prezentati direct la restaurant.");
        }
    }
}
