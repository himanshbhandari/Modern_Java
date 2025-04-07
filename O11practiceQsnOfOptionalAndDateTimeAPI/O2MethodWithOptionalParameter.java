package O11practiceQsnOfOptionalAndDateTimeAPI;
import java.util.Optional;

public class O2MethodWithOptionalParameter {
    public static String getUser(Optional<String>str){
        return str.orElse("default Value");
    }
    public static void main(String[] args) {
        Optional<String>name1=Optional.ofNullable("Himanshu");
        Optional<String>name2=Optional.ofNullable(null);
        String user1=getUser(name1);
        String user2=getUser(name2);
        System.out.println("user1: "+user1+" , user2: "+user2);
    }
}
