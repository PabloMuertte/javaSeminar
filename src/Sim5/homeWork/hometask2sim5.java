package Sim5.homeWork;

import java.util.*;
import java.util.stream.Collectors;

//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
public class hometask2sim5 {
    private static final String SEPARATOR = " ";

    public static void main(String[] args) {
        namelist();
    }

    public static void namelist() {
        List<String> array = new ArrayList<>();
        {
            array.add("Иван Иванов");
            array.add("Светлана Петрова");
            array.add("Кристина Белова");
            array.add("Анна Мусина");
            array.add("Анна Крутова");
            array.add("Иван Юрин");
            array.add("Петр Лыков");
            array.add("Павел Чернов");
            array.add("Иван Иванов");
            array.add("Петр Чернышов");
            array.add("Мария Федорова");
            array.add("Марина Светлова");
            array.add("Мария Савина");
            array.add("Иван Иванов");
            array.add("Мария Рыкова");
            array.add("Анна Крутова");
            array.add("Марина Лугова");
            array.add("Анна Владимирова");
            array.add("Петр Лыков");
            array.add("Иван Мечников");
            array.add("Петр Петин");
            array.add("Петр Лыков");
            array.add("Иван Ежов");
            System.out.println(array);
            count(array);
        }
    }
    public static void count(List<String> array) {
        Map<String, Integer> result = new HashMap<>();
        Integer count = 1;
        for (String buffer : array) {
            String name = buffer.split(SEPARATOR)[0];
            if (!result.containsKey(name)) {
                result.put(name, count);
            } else {
                if (result.containsKey(name))
                {
                    int newcount = 0;
                    newcount = result.get(name) + 1;
                    result.put(name, newcount);
                }
            }
        }
        sort(result);
    }

    public static void sort (Map<String, Integer> result) {
        Map<String, Integer> sortedMapInDescending = result.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(),
                        (entry1, entry2) -> entry2, LinkedHashMap::new));
        System.out.println("HashMap before sorting " + result);
        System.out.println("HashMap after sorting by value " + sortedMapInDescending);
    }
}
