package O8StreamApi4CollectionApi;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

class People{
    String name;
    int age;

    People(){}
    People(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class O2ParitionByExample {
    public static void main(String[] args) {
        //This method splits data into two groups based on a true/false condition.
        //ParitionBy(Predicate<T>) internally use predicate
        //T → Input type (Stream element).
        //Returns boolean → Decides if the element belongs to true or false partition.

        BiFunction<String, Integer, People>createPeople=People::new;
        List<People>peopleList= Arrays.asList(
                createPeople.apply("Himanshu",23),
                createPeople.apply("mohit",23),
                createPeople.apply("tunu",13),
                createPeople.apply("gunu",15),
                createPeople.apply("ravi",15),
                createPeople.apply("lalit",26)
        );
        Map<Boolean,List<People>>peopleMapPartitioned=peopleList.stream()
                .collect(Collectors.partitioningBy(people->people.age>=18));
        System.out.println(peopleMapPartitioned);
        System.out.println(peopleMapPartitioned.get(false));
        System.out.println(peopleMapPartitioned.get(true));

        System.out.println("************************************************************");

        List<Integer>numbers=Arrays.asList(1,3,2,4,2,33,45,66,77,232,56);
        Map<Boolean, List<Integer>>evenOdd=numbers.stream()
                .collect(Collectors.partitioningBy(num->num%2==0));
        System.out.println(evenOdd.get(true));
        System.out.println(evenOdd.get(false));

    }
}
