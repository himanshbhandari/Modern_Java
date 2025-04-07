package O11practiceQsnOfOptionalAndDateTimeAPI;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class O8CountdownTimer {
    public static void main(String[] args) throws InterruptedException {
        // Set a deadline (e.g., 30 seconds from now)
        LocalDateTime deadline = LocalDateTime.now().plusSeconds(30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Countdown started... Deadline at: " + deadline.format(formatter));

        while (true) {
            LocalDateTime now = LocalDateTime.now();

            // Stop when current time is after the deadline
            if (now.isAfter(deadline)) {
                System.out.println("⏰ Deadline Reached!");
                break;
            }

            // Calculate the remaining time using Duration
            Duration duration = Duration.between(now, deadline);

            long seconds = duration.getSeconds();
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;

            System.out.printf("⏳ Time left: %02d:%02d\n", minutes, remainingSeconds);

            // Sleep for 1 second
            Thread.sleep(1000);
        }
    }
}
