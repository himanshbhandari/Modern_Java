package O4methodReferences;

interface Printer{
    void prints(String msg);
}

public class O1UsingLambdaExpression {
    public static void main(String []args){

        Printer printer=msg->System.out.println(msg);
        printer.prints("with Lambda expression");

        Printer printer1=System.out::println;
        printer1.prints("with method refrence");


    }
}
