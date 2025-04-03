package O9practiceQsnStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class O14OddEvenPartition {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(5, 10, 15, 20, 25);
        Map<Boolean, List<Integer>>evenOddMap=numbers.stream().collect(Collectors.partitioningBy(num->num%2==0));
        System.out.println(evenOddMap.get(true));
        System.out.println(evenOddMap.get(false));
    }
}
