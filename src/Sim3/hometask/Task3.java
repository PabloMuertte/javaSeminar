package Sim3.hometask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task3 {
    public static void minMidMaxNum() {
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(1,11));
        }
        System.out.println(array);
        int min = array.get(0);
        int max = array.get(0);
        int total = 0;
        int avg=0;
        for(int i = 0; i < array.size(); i++){
            total += array.get(i);
            avg = total / array.size();
        }
        int n = array.size();
        for (int i = 1; i < n; i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        for (int i = 1; i < n; i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }
        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);
        System.out.println("Average is: " + avg);
    }
}
