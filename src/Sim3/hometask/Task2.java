package Sim3.hometask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task2 {
    public static void deleteEvenNum() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(34);
        array.add(2);
        array.add(3);
        array.add(10);
        array.add(8);
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

