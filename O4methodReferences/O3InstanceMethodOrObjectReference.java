package O4methodReferences;
import java.util.function.Consumer;

class CompanyNamePrinter{

    void printCompanyName(String name){
        System.out.println(name);
    }

}
public class O3InstanceMethodOrObjectReference {
    public static void main(String []args){

        var companyNamePrinter=new CompanyNamePrinter();
        Consumer<String>getCompanyName=companyNamePrinter::printCompanyName;
        getCompanyName.accept("HBTech");
    }

}
