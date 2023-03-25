package Sim1.task;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Scanner;

public class Task2 {
    public static void run () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name: ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName);
        LocalDateTime now = LocalDateTime.now();
        if ( now.isAfter(ChronoLocalDateTime.from(LocalTime.of(5,0))) &&
                (now.isBefore(ChronoLocalDateTime.from(LocalTime.of(11,59))) ) ){
            System.out.println("Good Morning, "+ userName);
        } else if ( now.isAfter(ChronoLocalDateTime.from(LocalTime.of(12,0))) &&
                (now.isBefore(ChronoLocalDateTime.from(LocalTime.of(17,59))) ) ) {
            System.out.println("Good Afternoon, "+ userName );
        } else if ( now.isAfter(ChronoLocalDateTime.from(LocalTime.of(17,0))) &&
                (now.isBefore(ChronoLocalDateTime.from(LocalTime.of(22,59))) ) ) {
            System.out.println("Good Evening, "+ userName );
        } else {
            System.out.println("Good Night, "+ userName );
        }
    }
}
