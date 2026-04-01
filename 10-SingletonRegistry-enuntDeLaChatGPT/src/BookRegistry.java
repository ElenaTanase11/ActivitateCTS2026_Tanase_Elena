import java.util.HashMap;
import java.util.Map;

public class BookRegistry {

    private BookRegistry() {
    }

    private static Map<String, Book> collections = new HashMap<>();

    public static void register(String cod, Book book) throws Exception {
        if(collections.containsKey(cod)) {
            throw new Exception("Codul este deja in registru");
        }
        else {
            collections.put(cod, book);
        }
    }

    public static Book getBook(String cod) {
        return collections.get(cod);
    }
}
