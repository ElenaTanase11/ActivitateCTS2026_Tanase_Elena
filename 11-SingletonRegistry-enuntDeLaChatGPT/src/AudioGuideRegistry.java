import java.util.HashMap;
import java.util.Map;

public class AudioGuideRegistry {
    private AudioGuideRegistry() {
    }

    private static Map<String, AudioGuide> collections = new HashMap<>();

    public static void register(String cod, AudioGuide audioGuide) throws Exception {
        if (collections.containsKey(cod)) {
            throw new Exception("Codul este utilizat");
        }
        else {
            collections.put(cod, audioGuide);
        }
    }

    public static AudioGuide getAudioGuide(String cod){
        return collections.get(cod);
    }
}
