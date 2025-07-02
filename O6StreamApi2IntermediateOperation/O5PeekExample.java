package O6StreamApi2IntermediateOperation;


import java.util.Arrays;
import java.util.List;

class Employee{
    public String name;
    public int age;
    public int salary;

    Employee(String name, int age, int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class O5PeekExample {
    public static void main(String []args){
        List<Employee>empList= Arrays.asList(new Employee("raman", 34, 23000),
                new Employee("Rohan" ,23, 340000),
                new Employee("Sobit", 22, 350000));

        List empLowerCaseList=empList.stream()
                .peek(System.out::println) //used for debuging peek internally used Consumer functional interface
                                            //and give stream for move further or to be continue the chaining .
                .map(e->e.name)
                .peek(System.out::println)
                .map(String::toLowerCase)
                .toList();

        empLowerCaseList.forEach(e->System.out.println("result=> "+e));

    }
}
