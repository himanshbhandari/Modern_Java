package O1practiceQsnLambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListOfString {
    public static void main(String[]args){
        List<String>players= Arrays.asList("Amu", "Virat", "Rohit", "Bumrah");
        Collections.sort(players , (a,b)->a.compareTo(b));
        System.out.println(players);
        Collections.sort(players, (a,b)->b.compareTo(a));
        System.out.println(players);

        List<Integer>scores=new ArrayList<>(Arrays.asList(4,1,6,2,7,9,3));
        scores.removeIf(num->num%2==1);
        System.out.println(scores);
    }
}
