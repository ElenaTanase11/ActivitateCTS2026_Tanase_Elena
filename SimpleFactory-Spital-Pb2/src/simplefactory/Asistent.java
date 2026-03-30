package simplefactory;

public class Asistent extends PersonalSpital{
    public Asistent(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public void prezintaRol() {
        System.out.println("Asistent " + super.toString());
    }
}
