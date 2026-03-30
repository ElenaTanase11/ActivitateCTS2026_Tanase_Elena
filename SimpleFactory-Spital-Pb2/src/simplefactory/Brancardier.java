package simplefactory;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public void prezintaRol() {
        System.out.println("Brancardier " + super.toString());
    }
}
