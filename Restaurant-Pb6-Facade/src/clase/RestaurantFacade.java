package clase;

public class RestaurantFacade {
    public void ocupaMasa(Masa masa) {
        if (masa.esteLibera()) {
            if (masa.esteDebarasata()) {
                if (masa.areServeteleNoi()) {
                    System.out.println("Clientul poate fi asezat la masa");
                }
                else {
                    System.out.println("Masa " + masa.getNumarMasa() + " nu are servetele noi");
                }
            }
            else {
                System.out.println("Masa " + masa.getNumarMasa() + " nu este debarasata");
            }
        }
        else {
            System.out.println("Masa " + masa.getNumarMasa() + " nu este libera");
        }
    }
}
