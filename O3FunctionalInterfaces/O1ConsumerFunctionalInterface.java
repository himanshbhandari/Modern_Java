package O3FunctionalInterfaces;

import java.util.function.Consumer;

public class O1ConsumerFunctionalInterface {

    public static void main(String[]args){
        //A consumer clas contains method accept which is void type
        //so Consumer takes input only not take any output
        //use case-When you just want to perform an action (like printing, storing in DB, or modifying an object).
        //
        Consumer<String> printMessage= message -> System.out.println("Message is = "+message);
        printMessage.accept("Rohit");
        //Real-world Example: Logging, Database operations (save/update/delete), printing data.

        //q.-> why we use consumer instead of system.out.println()  ?


    }
}
