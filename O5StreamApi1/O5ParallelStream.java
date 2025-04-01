package O5StreamApi1;

import java.util.List;

public class O5ParallelStream {
    public static void main(String ...args){
        List<String>cities=List.of("Delhi", "Noida", "Dun", "Mumbai");
        //A parallel stream divides data into multiple chunks and processes them concurrently using multiple CPU cores.
        cities.parallelStream()
                .forEach(city-> System.out.println(Thread.currentThread().getName()+" -- "+city));
    }
}
