package O1practiceQsnLambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAllNegativeNumUsingRemoveIf {

    public static void main(String[]args){
        List<Integer>marks=new ArrayList<>(Arrays.asList(-34,8,28,-23,-9,32,-55));
        marks.removeIf(mark->mark<0);
        System.out.println(marks);
    }
}
