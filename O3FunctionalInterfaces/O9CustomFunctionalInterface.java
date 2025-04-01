package O3FunctionalInterfaces;

@FunctionalInterface
interface MathOperation <T, R>{

    R applySq(T t);

    default int cube(int num){
        return num*num*num ;
    }
}
public class O9CustomFunctionalInterface {
    public static void main(String[]args){

        MathOperation<Integer, Integer>getSquare=a->a*a;
        System.out.println(getSquare.applySq(4));
        System.out.println(getSquare.cube(2));

    }
}
