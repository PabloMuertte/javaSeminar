package Sim5.classWork;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ClassworkTask1 {
    private static final Map<Integer, String> passportToName = new HashMap<>();

    public static void run() {
        passportToName.put(123456, "Ivanov");
        passportToName.put(321456, "Vasiliev");
        passportToName.put(234561, "Petrov");
        passportToName.put(234432, "Ivanov");
        passportToName.put(654321, "Petrova");
        passportToName.put(345678, "Ivanov");

        System.out.println(passportToName);

        for (Map.Entry<Integer, String> entry: passportToName.entrySet()) {
            if (entry.getValue().equals("Ivanov")) {
                System.out.println(entry);
            }
        }
    }

//    Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false,
//    если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове,
//    при этом
//    - повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
//    (Например, add - egg изоморфны)
//    -  буква может не меняться, а остаться такой же. (Например, note - code)
    public static void main(String[] args) {
        System.out.println(isIsomorph("abb", "baa"));
    }

    public static boolean isIsomorph(String a, String b) {
        Map<Character, Character> pair = new LinkedHashMap<>();
        if (a.length() != b.length()) return false;
        else {
            for (int i = 0; i < a.length(); i++) {
                if (pair.containsKey(a.charAt(i))){
                    if (pair.get(a.charAt(i)) !=b.charAt(i)) return false;
                }
                else pair.put(a.charAt(i),b.charAt(i));
            }
        }
        return true;
    }
}
