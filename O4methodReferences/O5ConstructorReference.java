package O4methodReferences;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class Person{

    public static int count=1;
    public String name;
    Person(){
        System.out.println("new object is created "+count++);
    }
    Person(String name){
        this.name=name;
        System.out.println("new object is created "+count++ +" and name is "+this.name);
    }

}

public class O5ConstructorReference {

    public static void main(String[]args){

        Supplier<Person> createPersonObj=Person::new;
        createPersonObj.get();
        createPersonObj.get();

        Function<String , Person>createWithName=Person::new;
        createWithName.apply("Himanshu");
    }
}
