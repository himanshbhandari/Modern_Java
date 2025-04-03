package O9practiceQsnStreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class O12FindMinValue {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(12, 45, 8, 32, 67);
        System.out.println(numbers.stream().min(Comparator.naturalOrder()).get());
    }
}
