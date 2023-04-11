package Sim5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class hometasksim5 {
    private static final String SEPARATOR = "/";
    private static final Map<String,String> dataBase = new HashMap<>();
    public static void main(String[] args) {
        while (true){
            System.out.print("Введите Имя и номер телефона в формвте имя номер телефона \n");
            System.out.print("Введите print чтобы вывести всю телефонную книгу\n");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (input.toLowerCase().startsWith("print")){
                System.out.println(dataBase+"\n");
                System.out.println(" ");
            }
            else{
                saveToDB(input);
            }
        }

    }
    private static void saveToDB(String input) {
        String name = input.split(SEPARATOR)[0];
        String num = input.split(SEPARATOR)[1];
        if (dataBase.containsKey(name)) {
            System.out.println("This phone number added for the existing name");
            System.out.println(" ");
            dataBase.put(name, dataBase.get(name) + "/" + num);
        } else {
            dataBase.put(name, String.valueOf(num));
            System.out.println("Information saved \n");
            System.out.println(" ");
        }
    }
}

