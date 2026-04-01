import java.util.HashMap;
import java.util.Map;

public class ApartamentRegistry {
    private ApartamentRegistry() {
    }

    private static Map<String, Apartament> collection = new HashMap<>();

    public static void register(String code, Apartament apartament) throws Exception {
        if (collection.containsKey(code)) {
            throw new Exception("Codul este folosit");
        }
        else {
            collection.put(code, apartament);
        }
    }

    public static Apartament getApartament(String code) {
        return collection.get(code);
    }
}
