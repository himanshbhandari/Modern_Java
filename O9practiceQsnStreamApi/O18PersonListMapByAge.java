package O9practiceQsnStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

class User{
    String name;
    int age;
    User(){};
    User(String name , int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class O18PersonListMapByAge {
    public static void main(String[] args) {
        BiFunction<String ,Integer ,User>createUser=User::new;
        List<User>userList= Arrays.asList(
                createUser.apply("ravi",21),
                createUser.apply("mohit",21),
                createUser.apply("sohit",23),
                createUser.apply("hianshu",24),
                createUser.apply("Rahul",25)
        );

        Map<Integer, List<User>>userMapByAge=userList.stream()
                .collect(Collectors.groupingBy(user->user.age));
        System.out.println(userMapByAge);

        Map<String, Integer>createMapUsingList=userList.stream()
                .collect(Collectors.toMap(User::getName, User::getAge));
        System.out.println(createMapUsingList);
    }
}
