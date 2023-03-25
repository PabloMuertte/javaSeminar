package Sim1.task;

import java.util.Scanner;

public class Hometask2 {
    public static void homeWorkTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your digit to calculate triangle digit: ");
        Integer factorialDigit = Integer.valueOf(scanner.next());
        int n = 1;
        for (int i = 1; i <= factorialDigit; i++) {
            n = n * i;
        }
        System.out.println("Your factorial of " + factorialDigit + " is " + n);
    }
}