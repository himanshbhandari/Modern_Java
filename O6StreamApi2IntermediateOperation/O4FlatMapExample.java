package O6StreamApi2IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class O4FlatMapExample {
    public static void main(String[] args) {
        List<List<String>>address= Arrays.asList(
                Arrays.asList("delhi", "rohini", "shastripark"),
                Arrays.asList("Noida", "Indrapuran","modinagar")
        );

        System.out.println(address);
        //The flatMap() method is used when we have a nested structure (list of lists) and we need to convert it into a single stream.
        List<String>cities=address.stream()
                .flatMap(List::stream) //flatMap(Function<T , Stream<R>>) this internally used by flatmap
                .collect(Collectors.toList());
        System.out.println(cities);

        List<String> sentences = Arrays.asList("Hello World", "Java Streams", "Functional Programming");

        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());

        System.out.println(words);
    }
}
