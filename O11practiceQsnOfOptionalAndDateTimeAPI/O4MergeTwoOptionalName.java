package O11practiceQsnOfOptionalAndDateTimeAPI;

import java.util.Optional;

public class O4MergeTwoOptionalName {
    public static void main(String[] args) {
        Optional<String>firstName=Optional.ofNullable("Himanshu");
        Optional<String>lastName=Optional.ofNullable("Bhandari");
        System.out.println(firstName);
                                //we user flatMap here because when you use map with optional it give optional so here already firstname is optional
        //so that create nested flatmap here.
        String fullName=firstName.flatMap(fn->lastName.map(ln->fn+ " "+ln)).get();
        System.out.println(fullName);

    }
}
