import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class O2LambdaWithList {
    public static void main(String []args){

        System.out.println("******************************************** forEach ****************************************");
        //read about varargs in java
        List<String>names= Arrays.asList("himanshu", "mohit", "aman", "rohit");
        names.forEach(name -> System.out.println(name));
        System.out.println(names);


        System.out.println("******************************************** removeIf ****************************************");
        //removeIf :- it's used for removing a element based on particular condition

//        List<Integer>playersAge=Arrays.asList(23,45,58,90,57,34,45,67,65);
//        dont use this because .asList return fixed size list you cant modify (add or remove) elements from it

        List<Integer>playersAge=new ArrayList<>(Arrays.asList(23,45,58,90,57,34,45,67,65));
        playersAge.removeIf(age->age>45);
        System.out.println(playersAge);

        System.out.println("*************************** compareTo and passing parameter ********************************");

        List<String>players=Arrays.asList("virat", "dhoni", "aRhane", "kapil","sachin","hardik");
        Collections.sort(players, (a,b)->a.compareTo(b));
        System.out.println(players);
        Collections.sort(players,(a,b)->b.compareTo(a));
        System.out.println(players);

        List<Integer>sectors=Arrays.asList(2,3,5,67,34,1,22);
        Collections.sort(sectors, (x,y)->x.compareTo(y));
        System.out.println(sectors);
        Collections.sort(sectors, (x, y)->y.compareTo(x));
        System.out.println(sectors);



    }
}
