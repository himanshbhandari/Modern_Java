package O9practiceQsnStreamApi;

import java.util.stream.Stream;

public class O1IterateStringArrUsingStream {
    public static void main(String[] args) {
        String[] names={"Himanshu", "Aman", "Rohit", "Priyanshu"};
        System.out.println(Stream.of(names).count());
        Stream<String>emptyStream=Stream.empty();
        System.out.println(emptyStream.count());
    }
}
