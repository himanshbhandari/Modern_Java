package O11practiceQsnOfOptionalAndDateTimeAPI;
import java.util.Optional;


public class O1GiveDefaultStringIfValueNull {
    public static void main(String[] args) {

        String myEmail=null;
        String email=Optional.ofNullable(myEmail).orElse("default@gmail.com");
        System.out.println(email);

        Optional<String>name=Optional.ofNullable("himanshu");
        name.ifPresent(n-> System.out.println("name is ->"+n));
        String password="null";
        String getPassword=Optional.ofNullable(password)
                .orElseThrow(()-> new  RuntimeException("passowrd is null"));

    }
}
