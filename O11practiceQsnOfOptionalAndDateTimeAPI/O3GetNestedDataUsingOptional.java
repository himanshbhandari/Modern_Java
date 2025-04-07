package O11practiceQsnOfOptionalAndDateTimeAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class OptionalUser{
    String name;
    Address address;
    OptionalUser(){};
    OptionalUser(String name, Address address){
        this.name=name;
        this.address=address;
    }
}

class Address{

    String address;
    City city;
    Address(){};
    Address(String address, City city){
        this.address=address;
        this.city=city;
    }

}

class City{

    String cityName;
    City(){};
    City(String cityName){
        this.cityName=cityName;
    }

}
public class O3GetNestedDataUsingOptional {
    public static void main(String[] args) {

        OptionalUser user1=new OptionalUser("Himanshu", new Address("Uttarakhand",  new City("gauchar")));
        OptionalUser user2=new OptionalUser("Mohit", new Address("Delhi", new City("Gulabibah")));
        OptionalUser user3=new OptionalUser("Rahul", new Address("Rajstan", new City("jaipur")));
        OptionalUser user4=new OptionalUser();

        List<OptionalUser>userLists= Arrays.asList(user1, user2, user3, user4);
//        System.out.println(Optional.ofNullable(userLists.stream().map(user->user.address.city).toList()));

        List<String> cityNames = userLists.stream()
                .map(user -> Optional.ofNullable(user)
                        .map(u -> u.address)
                        .map(addr -> addr.city)
                        .map(city -> city.cityName)
                        .orElse("Unknown"))
                .collect(Collectors.toList());

        System.out.println(cityNames);

    }
}
