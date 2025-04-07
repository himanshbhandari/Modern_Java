package O11practiceQsnOfOptionalAndDateTimeAPI;

import java.time.LocalTime;

public class O7TaskSceduleBetween9To6 {

    public static String call9To6(){
        return "DB is ON";
    }
    public static void main(String[] args) {
        LocalTime localTime=LocalTime.now();
        if(localTime.getHour()>=9 && localTime.getHour()<=18){
            System.out.println(call9To6());
        }else{
            System.out.println("db is close");
        }
    }
}
