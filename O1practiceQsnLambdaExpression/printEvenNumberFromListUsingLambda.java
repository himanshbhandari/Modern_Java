package O1practiceQsnLambdaExpression;
import java.util.List;
import java.util.function.Predicate;

public class printEvenNumberFromListUsingLambda {

    public static void main(String[]args){
        List<Integer>numbers=List.of(3, 4,2,5,8,9,10);
        Predicate<Integer> checkEven= num->num%2==0;
        numbers.forEach((num)->{
            if(checkEven.test(num)){
                System.out.print(num+ " ");
            }
        });
    }
}
