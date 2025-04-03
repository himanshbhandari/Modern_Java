package O9practiceQsnStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class O2ConvertStringArrayElementUpperCase {
    public static void main(String[] args) {
        List<String>names= Arrays.asList("my", "name","is","Himanshu","bhandari" );
        List<String>upperCaseName=names.stream()
                .map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseName);
    }
}
