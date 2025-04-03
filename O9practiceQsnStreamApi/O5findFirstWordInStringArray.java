package O9practiceQsnStreamApi;

import java.util.Arrays;
import java.util.List;

public class O5findFirstWordInStringArray {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mohan", "Sumit", "rohit", "himanshu");
        System.out.println(names.stream().findFirst());
    }
}
