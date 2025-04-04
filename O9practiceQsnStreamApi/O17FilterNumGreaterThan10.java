package O9practiceQsnStreamApi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class O17FilterNumGreaterThan10 {
    public static void main(String[] args) {
        List<Integer>numberList= Arrays.asList(23,1,25,2,4,67,11,8,99);

        List<Integer>immutableList= numberList.stream().filter(num->num>10).collect(Collectors.toList());
//        immutableList.add(89); //this give error on run time
        List<Integer>mutableList=numberList.stream()
                .filter(num->num>10)
                .map(num->num*num)
                .sorted((a,b)->b-a)
                .collect(Collectors.toCollection(ArrayList::new));
        mutableList.add(85);
        System.out.println(mutableList);
    }
}
