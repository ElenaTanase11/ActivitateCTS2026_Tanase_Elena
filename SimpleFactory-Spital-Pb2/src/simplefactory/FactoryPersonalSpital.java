package simplefactory;

public class FactoryPersonalSpital {
    public static PersonalSpital crearePersonal(TipPersonal tipPersonal, String nume, int vechime) throws IllegalAccessException {
        switch (tipPersonal){
            case ASISTENT -> {
                return new Asistent(nume, vechime);
            }
            case BRANCARDIER -> {
                return new Brancardier(nume, vechime);
            }
            case MEDIC -> {
                return new Medic(nume, vechime);
            }
            default -> throw new IllegalArgumentException("Nu face parte din personalul spitalului");
        }
    }
}
