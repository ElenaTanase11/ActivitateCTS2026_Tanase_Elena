//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        RestaurantProxy restaurantProxy = new RestaurantProxy(restaurant);

        restaurantProxy.rezervaMasa(2);
        restaurantProxy.rezervaMasa(4);
        restaurantProxy.rezervaMasa(5);
    }
}