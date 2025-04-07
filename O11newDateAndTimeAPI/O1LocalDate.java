package O11newDateAndTimeAPI;

import java.time.LocalDate;

public class O1LocalDate {
    public static void main(String[] args) {
        LocalDate date =LocalDate.now();   //give current Date
        System.out.println(date);

        LocalDate bday=LocalDate.of(2004,4,5);
        System.out.println("dob: "+bday);
        System.out.println("day of week: "+bday.getDayOfWeek());
        System.out.println("dob is leap year "+bday.isLeapYear());
    }
}
