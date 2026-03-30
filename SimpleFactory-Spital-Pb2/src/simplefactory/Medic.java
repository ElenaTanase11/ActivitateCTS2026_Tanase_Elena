package simplefactory;

public class Medic extends PersonalSpital{
    public Medic(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public void prezintaRol() {
        System.out.println("Medic " + super.toString());
    }
}
