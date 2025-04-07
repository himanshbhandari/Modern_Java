package O11newDateAndTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class O4LocalDateFormatter {
    public static void main(String[] args) {
        LocalDate currentDate=LocalDate.now();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatDate=dateTimeFormatter.format(currentDate);
        System.out.println("format Date is : "+formatDate);
    }
}
