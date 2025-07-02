package O12java8CollectionEnhancement;

import java.util.*;

public class O1NewCollectionFeature {
    public static void main(String[] args) {
        List<Integer> numberList=List.of(2,3,8,6,5,10,4,56,7); //List.of() method give immutable list
//        numberList.add(5);  //it give java.lang.UnsupportedOperationException this error cause of immutable list

        Set<Integer>numSet=Set.of(2,3,5,6);//it give immutable set
//        numSet.add(4); this give same error has above
//        Set<Integer>numSet2=Set.of(2,3,3,5); //it also give java.lang.IllegalArgumentException error you can insert duplicate value;

        Map<Integer, String>keyValueMap=Map.of(1,"himansh", 2, "mohit");
//        Map<Integer, String>keyValueMap2=Map.of(1,"himansh", 2, "mohit", 1,"ravi"); //this give same above erro duplicate key can't insert
//        System.out.println(keyValueMap.put(4,"rohit"));  //you  can't add cause of immutable

        List<Integer>scores= new ArrayList<>(List.of(2,3,8,6,5,10,4,56,7));
        scores.removeIf(num->num%2!=0);  //remove odd element
        System.out.println(scores);

        scores.replaceAll(num->num+2);
        System.out.println(scores);

        System.out.println("********************* computeIfAbsent ******************************************");

        Map<Integer, String>myMap=new HashMap<>();
        myMap.put(5,"Syam");
        //if key not present inside map so compute if make our passed key as a key and take function as second parameter and its return value make as
        //value of map
        myMap.computeIfAbsent(1, key->"Himanshu");
        myMap.computeIfAbsent(2, key->"ravi");

        //computeIfAbsent intrenallly use Functional interface and return same value which return functional interface.
        myMap.computeIfAbsent(3,key->"Suresh").toLowerCase();
//        myMap.computeIfAbsent(6, key->null); //it didn't do anything
//        myMap.computeIfAbsent(1,key -> "rahul");   //key is present so nothing happen nor give error

        /*Compute
        Always runs, regardless of whether the key is present or not.
        If the key is not present, the current value will be null
        It can be used to insert or update values.
                            where as
        ComputeIfPresent
         Only runs if the key is already present in the map and value is not null.
         It updates the existing value using the logic you provide.
                */
        myMap.compute(1, (k, v) -> "newValue"); //if you want override existing value in key so use compute
        myMap.computeIfPresent(2,(key,value)->value.toUpperCase());
        System.out.println(myMap);

        Map<String, List<String>> gradeMap = new HashMap<>();
        gradeMap.computeIfAbsent("A", key -> new ArrayList<>()).add("Himanshu");
        gradeMap.computeIfAbsent("B", key -> new ArrayList<>()).add("Mohit");
        gradeMap.computeIfAbsent("A", key -> new ArrayList<>()).add("Rahul");
        System.out.println(gradeMap);

    }
}
