package O8StreamApi4CollectionApi;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Person{
    String name;
    int age;

    Person(){}
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class O1GroupingByExample {
    public static void main(String[] args) {

        BiFunction<String , Integer, Person>createPerson=Person::new;
        List<Person> personList= Arrays.asList(
            createPerson.apply("Himanshu", 23),
            createPerson.apply("mohit", 23),
            createPerson.apply("rahul", 26),
            createPerson.apply("kuldeep",26),
            createPerson.apply("ravi",24),
                createPerson.apply("tunut",12),
                createPerson.apply("gunu",16),
                createPerson.apply("sonu",18)
        );

        //groupingBy(Function<T,R>) it internally use Function interface internally
        Map<Integer, List<Person>> groupedByAge = personList.stream()
                .collect(Collectors.groupingBy(person -> person.age));
        System.out.println(groupedByAge);


        System.out.println("------------------------------------------------");
        //group by using string length
        Map<Integer, List<String>>namesByLen=Arrays.asList("moh","nhr", "shr", "hikn", "himans", "nnsh", "rohan", "himanshu")
                .stream().collect(Collectors.groupingBy(String::length));
        System.out.println(namesByLen);

    }
}
