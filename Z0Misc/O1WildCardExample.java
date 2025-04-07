package Z0Misc;
import java.util.*;
public class O1WildCardExample {
        public static <T> void copyList(List<? extends T> source, List<? super T> destination) {
            for (T item : source) {
                destination.add(item);
            }
        }

        public static void main(String[] args) {
            List<Integer> source = Arrays.asList(1, 2, 3);
            List<Number> destination = new ArrayList<>();

            /*
            Use Case	Wildcard	Why
            Read data	? extends T	It might be Apple, Banana, etc., so you can only read safely
            Write data	? super T	You can safely write Apple into a Fruit list or Object list
             */
            copyList(source, destination);

            System.out.println(destination); // [1, 2, 3]
        }
    }
