package main;

import clase.Masa;
import clase.RestaurantFacade;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1, true, true, true);
        Masa masa2 = new Masa(2, true, false, true);
        Masa masa3 = new Masa(3, false, true, true);
        Masa masa4 = new Masa(4, true, true, false);

        RestaurantFacade restaurantFacade = new RestaurantFacade();

        restaurantFacade.ocupaMasa(masa1);
        restaurantFacade.ocupaMasa(masa2);
        restaurantFacade.ocupaMasa(masa3);
        restaurantFacade.ocupaMasa(masa4);
    }
}
