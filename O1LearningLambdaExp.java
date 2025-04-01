
interface Greeting{
    void sayHello();
}

public class O1LearningLambdaExp {
    public static void main(String []args){
        //before java 8 lambda function
        Greeting g=new Greeting(){//this is called Anonymous function when you override its method inherting it.
            @Override
            public void sayHello() {
              System.out.println("Hello before lambda");
            }
        };

        g.sayHello();

        //after lambda expression

        Greeting greeting =()->System.out.println("Hello after lambda expression");
        greeting.sayHello();
    }
}
