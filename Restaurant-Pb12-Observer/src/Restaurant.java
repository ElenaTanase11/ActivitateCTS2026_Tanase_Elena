import java.util.ArrayList;
import java.util.List;

public class Restaurant implements ISubject{

    private String numeRestaurant;
    private List<IObserver> listaClienti;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(IObserver observer) {
        listaClienti.add(observer);
    }

    @Override
    public void stergeObserver(IObserver observer) {
        listaClienti.remove(observer);
    }

    @Override
    public void notificaObserveri(String mesaj) {
        for (IObserver observer : listaClienti) {
            observer.primesteNotificare(mesaj);
        }
    }

    public void adaugaOferta(String oferta) {
        System.out.println("Restaurantul " + numeRestaurant
                + " a adaugat oferta: " + oferta);

        notificaObserveri("Oferta noua: " + oferta);
    }

    public void adaugaMeniuNou(String meniu) {
        System.out.println("Restaurantul " + numeRestaurant
                + " a adaugat meniul: " + meniu);

        notificaObserveri("Meniu nou: " + meniu);
    }
}
