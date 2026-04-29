package ro.ase.cts.clase;

public class Spital implements ISpital{
    private String numeSpital;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    @Override
    public void interneaza(Pacient pacient) {
        System.out.println("Pacientul: " + pacient.getNume() + " a fost internat in spitalul " + numeSpital);
    }
}
