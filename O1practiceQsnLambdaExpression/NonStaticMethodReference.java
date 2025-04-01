package O1practiceQsnLambdaExpression;
import java.util.function.Function;

class StringProcessor {
    public int getLength(String str) {  // Non-static method
        return str.length();
    }
}

public class NonStaticMethodReference {
    public static void main(String[] args) {
        // Using method reference without creating an instance first
//        Function<StringProcessor, Integer> getLengthRef = StringProcessor::getLength;
//
//        StringProcessor processor = new StringProcessor();
//        System.out.println(getLengthRef.apply(processor, "Hello")); // Output: 5
    }
}
