package O11practiceQsnOfOptionalAndDateTimeAPI;

import java.time.LocalDateTime;

public class O6ExtractDateAndTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("year : "+localDateTime.getYear()
                +" , months : "+localDateTime.getMonth()+" , days : "+localDateTime.getDayOfWeek()
                +" , hours : "+localDateTime.getHour()+ " , minutes : "+localDateTime.getMinute()
                +", seconds: "+localDateTime.getSecond()
        );
    }
}
