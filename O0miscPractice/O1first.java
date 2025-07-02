package O0miscPractice;

import java.util.*;
import java.util.stream.*;
public class O1first {
    public static void main(String []args){

        //q1-> find sum of integer====>>>>
        List<Integer>score=Arrays.asList(18,4,5,7,1,3,12,13,17,15,16,23,37,44,2);
        int sum=score.stream().mapToInt(Integer::intValue).sum();
        //we cant so simply score.stream().sum() because Integer can't contain sum method so we map it into integer
        // and convert each Integer to int value and then apply sum.
        System.out.println(sum);

        System.out.println("====================================================");

        int []arr={3,4,5,1};
        int arrSum=Arrays.stream(arr).sum();

        //here we dont need to write mapToInt because here already arr contain int value
        System.out.println(arrSum);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        //q2-> find max and min element ====>>>>
        int max=score.stream().mapToInt(Integer::intValue).max().orElse(0);
        int min=score.stream().min(Integer::compareTo).orElse(0);
        System.out.println("max: "+max);
        System.out.println("min : "+min);


        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        //q3-> find even and odd element ====>>>>
        List<Integer>evenScore=score.stream().filter(num->num%2==0).toList();
        List<Integer>oddScore=score.stream().filter(num->num%2!=0).collect(Collectors.toList());
        System.out.println("evenScore :" +evenScore);
        System.out.println("odd score :" + oddScore);



    }
}
