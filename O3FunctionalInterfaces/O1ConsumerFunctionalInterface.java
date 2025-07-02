package O3FunctionalInterfaces;

import java.util.*;
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

        System.out.println("=====================================================================");
        String s="abctaby";
        int n=s.length();
        Set<Character>seen=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        int max=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            sb.append(c);
            if(seen.contains(c)){
                max=Math.max(sb.length()-1, max);
                seen.clear();
            }else{
                seen.add(c);
            }
        }
        if(max==0){
            max=s.length();
        }
        System.out.println("max len substring is====> "+max);

    }
}
