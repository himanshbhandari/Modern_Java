package O5StreamApi1;

import java.util.List;
import java.util.stream.Stream;

public class O1CreateStreamFromList {
    public static void main(String ...args){
        List<Integer>numbers=List.of(4,2,1,64,74,3);
        Stream<Integer>numStream=numbers.stream();
        numStream.forEach(System.out::println);

        //this give error now because i'm using stream ony one time
//        numStream.forEach(System.out::println);
    }
}
