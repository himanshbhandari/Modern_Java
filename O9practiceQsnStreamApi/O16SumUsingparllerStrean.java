package O9practiceQsnStreamApi;

import java.util.List;
import java.util.stream.IntStream;

public class O16SumUsingparllerStrean {
    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1, 50)
                .boxed().toList();
    }
}
