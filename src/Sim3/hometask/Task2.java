package Sim3.hometask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task2 {
    public static void deleteEvenNum() {
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(1,11));
        }
        System.out.println(array);
        for (Iterator<Integer> iterator = array.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                System.out.println("This is Even Number: " + number);
                iterator.remove();
            }
        }
        System.out.println(array);
    }
}

