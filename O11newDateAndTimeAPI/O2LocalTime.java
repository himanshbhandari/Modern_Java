package O11newDateAndTimeAPI;

import java.time.LocalTime;

public class O2LocalTime {
    public static void main(String[] args) {
        LocalTime currentTime=LocalTime.now(); //give current time
        LocalTime specificTime=LocalTime.of(15, 30);
        System.out.println("current time :"+currentTime);
        System.out.println("current time hours and min and sec : "+currentTime.getHour()+":"+currentTime.getMinute()+":"+currentTime.getSecond());
        System.out.println("specific time : "+specificTime);

    }
}
