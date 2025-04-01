package O5StreamApi1;

import java.util.List;

public class O4SequentialStream {
    public static void main(String ...args){
        List<String>cities =List.of("Noida", "Jaipur", "Rishikesh","Lucknow");
        //A sequential stream processes data one element at a time, in order.
        //Sequential Stream and Default behvaiour
        cities.stream()
                .forEach(city-> System.out.println(Thread.currentThread().getName()+" -- "+city));
    }
}