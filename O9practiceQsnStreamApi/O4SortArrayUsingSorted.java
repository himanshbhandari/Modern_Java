package O9practiceQsnStreamApi;

import java.util.Arrays;
import java.util.List;

public class O4SortArrayUsingSorted {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(11,11,42,13,4,45,23,12,4,6,17);
        nums=nums.stream()
                .sorted().toList();
        System.out.println(nums);
        System.out.println(nums.stream().sorted((x,y)->y.compareTo(x)).toList());
        System.out.println(nums.stream().distinct().toList());
    }
}
