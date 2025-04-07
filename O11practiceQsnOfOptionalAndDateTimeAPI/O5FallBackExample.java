package O11practiceQsnOfOptionalAndDateTimeAPI;
import java.util.Optional;

public class O5FallBackExample {

    public static void main(String[] args) {

        String result = getFromDB()
                .orElseGet(() -> getFromCache()
                        .orElseGet(() -> "default"));
        System.out.println("Result: " + result);
    }

    static Optional<String> getFromDB() {
        System.out.println("Checking DB...");
        return Optional.empty();
    }

    static Optional<String> getFromCache() {
        System.out.println("Checking Cache...");
        return Optional.of("value-from-cache");
    }
}

