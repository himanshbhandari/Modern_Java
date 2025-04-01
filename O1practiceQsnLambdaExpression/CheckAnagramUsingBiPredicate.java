package O1practiceQsnLambdaExpression;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class CheckAnagramUsingBiPredicate {
    public static void main(String[]args){
        BiPredicate<String, String>isAnagram=(a,b)-> {
            char[]arr=a.toCharArray();
            char[]brr=b.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(brr);
//            return Arrays.equals(arr, brr);
            return new String(arr).equals(new String(brr));
//            return arr.toString().equals(brr.toString()); it return memeory address which give hashcode but i want compare values
        };

        System.out.println(isAnagram.test("aman", "nmaa"));
        System.out.println(isAnagram.test("aa", "aa"));
        System.out.println(isAnagram.test("bas", "dda"));
    }
}
