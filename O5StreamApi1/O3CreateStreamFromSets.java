package O5StreamApi1;

import java.util.Set;
import java.util.stream.Stream;

public class O3CreateStreamFromSets {
    public static void main(String ...args){
        Set<String>city=Set.of("Noida", "Delhi", "mumbai","dun");
        Stream<String>cityStream= city.stream();
        cityStream.forEach(System.out::println);
    }
}
