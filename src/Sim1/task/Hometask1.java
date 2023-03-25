package Sim1.task;

import java.util.Scanner;

public class Hometask1 {
    public static void homeWorkTask1 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your digit to calculate triangle digit: ");
        Integer userDigit = Integer.valueOf(scanner.next());
        Integer newDigit = userDigit*(userDigit+1)/2;
        System.out.println("Your Triangle digit: " + newDigit);

    }
}
