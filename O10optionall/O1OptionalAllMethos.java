package O10optionall;

import java.util.Optional;

public class O1OptionalAllMethos {
    public static void main(String[] args) {
        /**
         * Optional.of(value)   ==> Use this when you're 100% sure the value is not null. If value is null, it throws NullPointerException!
         * Optional.ofNullable  ==> Use when the value might be null. it handle null value also
         * Optiona.empty      ==> represents no value.
         * Optinal.isEmpty     ==> give true is value is empty else false
         * Optional.isPresent() ==> give true value present inside it and else give false.
         * Optional.ifPresent()  ==> if check it value present then do something ifPresent(Consumer<T>) it internally use Consumer interface
         * Opetional.nullableOf().orElse()     ==> orElse(defaultValue) – Return value if present, otherwise return default
         * Optional.nullableOf().orElseGet()     ==>orElseGet(Supplier<R>)
         * Optional.nullableOf().elseThrow()
         */

        String name="rohit";
        Optional<String>nameOption=Optional.of(name); // If value is null, it throws NullPointerException!
        System.out.println("Optional.of() : "+name);

        System.out.println("***********************************************************************************");

        String player=null;
        Optional<String>OptionalPlayer=Optional.ofNullable(player); //it handle null value
        System.out.println("Optional.ofNullable() :"+player);

        System.out.println("***********************************************************************************");

        Optional<String>checkEmpty=Optional.empty();//create optional with empty value
        System.out.println("Optional.empty() :"+checkEmpty);

        System.out.println("***********************************************************************************");

        Optional<String>footballPlayer=Optional.of("Messi");
        System.out.println("footballPlayer.isEmpty() :"+footballPlayer.isEmpty());
        if(footballPlayer.isPresent()){
            System.out.println("Optional.isPresent() :"+footballPlayer.isPresent());
        }else{
            System.out.println("footballPlyaer is not present");
        }

        System.out.println("***********************************************************************************");

        footballPlayer.ifPresent(value-> System.out.println("value is present : "+value));

        System.out.println("***********************************************************************************");

        Optional<String> optional = Optional.ofNullable(null);
        String username = optional.orElse("Guest");
        System.out.println(username);

        System.out.println("***********************************************************************************");

        String myName=(String)Optional.ofNullable(null).orElseGet(()->"Himanshu");
        System.out.println(myName);

        System.out.println("***********************************************************************************");

        String place=(String)Optional.ofNullable(null).orElseThrow(()-> new RuntimeException("place value is not present"));
        System.out.println(place);


    }
}
