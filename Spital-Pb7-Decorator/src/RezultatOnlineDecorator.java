public class RezultatOnlineDecorator extends DecoratorRezultat{

    public RezultatOnlineDecorator(IRezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void puneLaDispozitieRezultat() {
        rezultat.puneLaDispozitieRezultat();
        System.out.println("Rezultatul este disponibil si pe platforma online.");
    }
}
