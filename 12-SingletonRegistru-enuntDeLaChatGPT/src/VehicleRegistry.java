import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private VehicleRegistry() {
    }

    private static Map<String, Vehicle> colectie = new HashMap<>();

    public static void register(String code, Vehicle vehicle) throws Exception {
        if (colectie.containsKey(code)) {
            throw new Exception("Codul este utilizat");
        }
        else {
            colectie.put(code, vehicle);
        }
    }

    public static Vehicle getVehicle(String code){
        return colectie.get(code);
    }
}
