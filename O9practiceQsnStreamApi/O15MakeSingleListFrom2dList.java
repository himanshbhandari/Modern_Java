package O9practiceQsnStreamApi;

import java.util.Arrays;
import java.util.List;

public class O15MakeSingleListFrom2dList {
    public static void main(String[] args) {
        List<List<Integer>>nestedList= Arrays.asList(
                Arrays.asList(2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(2,3,6)
        );
        System.out.println(nestedList);
        List<Integer>singleList=nestedList.stream().flatMap(num->num.stream()).toList();
        List<Integer>anotherWaySingleList=nestedList.stream().flatMap(List::stream).toList();
        System.out.println(singleList);
        System.out.println(anotherWaySingleList);
    }
}
