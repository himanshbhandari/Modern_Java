package O9practiceQsnStreamApi;

import java.util.Arrays;
import java.util.List;

public class O3FilterEvenNumber {
    public static void main(String[] args) {
        List<Integer>nums= Arrays.asList(11,42,13,4,45,23,12,6,17);
        List<Integer>evenNum=nums.stream()
                .filter(num->num%2==0).toList();
        System.out.println(evenNum);
    }
}
