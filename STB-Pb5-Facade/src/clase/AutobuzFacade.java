package clase;

public class AutobuzFacade {
    private Usa usaFata;
    private Usa usaMijloc;
    private Usa usaSpate;

    public AutobuzFacade(Usa usaFata, Usa usaMijloc, Usa usaSpate) {
        this.usaFata = usaFata;
        this.usaMijloc = usaMijloc;
        this.usaSpate = usaSpate;
    }

    public void puneToateUsileInModLiber(){
        usaFata.puneInModLiber();
        usaMijloc.puneInModLiber();
        usaSpate.puneInModLiber();
    }

    public void deschideToateUsileFortat(){
        usaFata.deschideFortat();
        usaMijloc.deschideFortat();
        usaSpate.deschideFortat();
    }
}
