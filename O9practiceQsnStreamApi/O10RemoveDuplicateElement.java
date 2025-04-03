package O9practiceQsnStreamApi;

import java.util.Arrays;
import java.util.List;

public class O10RemoveDuplicateElement {
    public static void main(String[] args) {
        List<Integer>scores = Arrays.asList(5,1, 2, 2, 3, 4, 4, 5);
        System.out.println(scores.stream().distinct().toList());
    }
}
