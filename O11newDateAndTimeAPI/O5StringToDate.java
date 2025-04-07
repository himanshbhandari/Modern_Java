package O11newDateAndTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class O5StringToDate {
    public static void main(String[] args) {
        String inputDate="03-04-2025";
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate=LocalDate.parse(inputDate, dateTimeFormatter);
        System.out.println("parse local date: "+localDate);
    }
}
