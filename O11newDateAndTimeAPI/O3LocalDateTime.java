package O11newDateAndTimeAPI;

import java.time.LocalDateTime;

public class O3LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime currentDateTime=LocalDateTime.now();
        LocalDateTime specificTime=LocalDateTime.of(2025,4, 5,16,25);
        System.out.println("currentDateTime is : "+currentDateTime);
        System.out.println("Specific Time is : "+specificTime);
    }
}
