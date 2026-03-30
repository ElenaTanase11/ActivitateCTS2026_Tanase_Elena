package simplefactory;

public abstract class PersonalSpital {
    private String nume;
    private int vechime;

    public PersonalSpital(String nume, int vechime) {
        this.nume = nume;
        this.vechime = vechime;
    }

    public abstract void prezintaRol();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", vechime=").append(vechime);
        return sb.toString();
    }
}
