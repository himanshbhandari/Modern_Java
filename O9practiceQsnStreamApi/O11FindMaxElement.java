package O9practiceQsnStreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class O11FindMaxElement
{
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(12, 45, 8, 32, 67);
        Optional<Integer>maxValue=numbers.stream()
                .max(Comparator.naturalOrder());
        maxValue.ifPresent(max-> System.out.println(max));

    }
}
