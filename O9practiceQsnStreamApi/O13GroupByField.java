package O9practiceQsnStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

class Person{
    String name;
    String department;

    Person(){}

    Person(String name, String department){
        this.name=name;
        this.department=department;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

public class O13GroupByField {
    public static void main(String[] args) {

        BiFunction<String, String, Person>createPerson=Person::new;

        List<Person>personList= Arrays.asList(
                createPerson.apply("Himanshu","IT"),
                createPerson.apply("Mohit","HM"),
                createPerson.apply("Ravi","IT")
        );

        Map<String, List<Person>> personMap=personList.stream().collect(Collectors.groupingBy(person->person.department));
        System.out.println(personMap);

    }
}
