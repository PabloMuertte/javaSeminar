package Sim3.classtask;
// заполнить список 10ю случайными числами
// отсортировать список методом  sort() и вывести его на экран

import java.util.*;

public class Task1 {
    public static void createlist() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1, 11));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}