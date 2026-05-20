import java.util.ArrayList;
import java.util.List;

public class GrupAutobuze implements ComponentaAutobuz{

    private String denumireGrup;
    private List<ComponentaAutobuz> listaAutobuze;

    public GrupAutobuze(String denumireGrup) {
        this.denumireGrup = denumireGrup;
        this.listaAutobuze = new ArrayList<>();
    }

    public void adaugaElement(ComponentaAutobuz componentaAutobuz) {
        listaAutobuze.add(componentaAutobuz);
    }

    public void stergeElement(ComponentaAutobuz componentaAutobuz) {
        listaAutobuze.remove(componentaAutobuz);
    }

    public ComponentaAutobuz getElement (int index) {
        return listaAutobuze.get(index);
    }

    @Override
    public void afiseazaDEtalii() {
        System.out.println("Grup autobuze: " + denumireGrup);

        for (ComponentaAutobuz componenta : listaAutobuze) {
            componenta.afiseazaDEtalii();
        }
    }
}
