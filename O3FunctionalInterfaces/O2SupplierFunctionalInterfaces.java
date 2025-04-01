package O3FunctionalInterfaces;

import java.util.function.Supplier;

public class O2SupplierFunctionalInterfaces {
    public static void main (String []args){
        //Supplier not take input it only return output value
        //Real-world Example: Getting current date/time, fetching user data from DB, generating IDs.
        Supplier<String>companyName=()->"HBtech";
        System.out.println(companyName.get());
    }
}
