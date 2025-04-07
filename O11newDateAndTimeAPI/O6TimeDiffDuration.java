package O11newDateAndTimeAPI;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class O6TimeDiffDuration {
    public static void main(String[] args) {
        LocalDate currentDate=LocalDate.now();
        LocalDate dob=LocalDate.of(2000,8,10);
        Period difference=Period.between( dob , currentDate);
        System.out.println("year diff : "+difference.getYears()+ " : "+difference.getMonths()+" : "+difference.getDays());

        System.out.println("*************************************************************************************************");

        LocalTime currentTime=LocalTime.now();
        LocalTime specificTime=LocalTime.of(15, 56);
        Duration durationDiff=Duration.between(currentTime, specificTime);
        System.out.println("hours diff : "+durationDiff.toHours()+ " sec diff : "+durationDiff.getSeconds()+ " min diff : "+durationDiff.toMinutes());


        LocalDate date = LocalDate.now();
        LocalDate nextWeek = date.plusWeeks(1);
        LocalDate nextMonth = date.plusMonths(1);

        LocalDate pastDate = date.minusYears(2);
        System.out.println("date is : "+date+" , next week : "+nextWeek+" , next month :"+nextMonth+" , pastDate : "+pastDate);
    }
}
