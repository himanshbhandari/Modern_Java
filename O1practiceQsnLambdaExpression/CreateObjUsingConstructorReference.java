package O1practiceQsnLambdaExpression;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class Car{
    String name;
    Car(){}

    Car(String name){
        this.name=name;
    }

    int multiply(int a, int b){
        return a*b;
    }
}
public class CreateObjUsingConstructorReference {
    public static void main(String[]args){
        Supplier<Car>createObj=Car::new;
        var car1=createObj.get();
        System.out.println(car1.name);
        Function<String , Car>createArgObj=Car::new;
        var car2=createArgObj.apply("honda");
        System.out.println(car2.name);
        BinaryOperator<Integer>getMultiple=car2::multiply;
        System.out.println(getMultiple.apply(6,4));
    }
}
