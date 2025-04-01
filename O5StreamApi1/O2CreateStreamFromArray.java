package O5StreamApi1;

import java.util.stream.Stream;

public class O2CreateStreamFromArray {
    public static void main(String ...args){
        String[]fruits={"apple", "mango", "pineapple", "orange"};
        Stream<String>fruitStream=Stream.of(fruits);
//        fruitStream.forEach(String::toUpperCase);
        fruitStream.forEach(System.out::println);

    }
}
