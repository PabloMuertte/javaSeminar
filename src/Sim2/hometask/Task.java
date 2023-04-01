package Sim2.hometask;

import java.io.FileWriter;
import java.io.IOException;

public class Task {
    public static String newParsing(String arg) {
        String[] arr = arg.split("}");
        StringBuilder result = new StringBuilder();
        StringBuilder newstr = new StringBuilder("");
        for (int i = 0; i < arr.length - 1; i++) {
            result = new StringBuilder("");
            result.append(arr[i]);
            result.delete(0, 2);
            String[] arr1 = result.toString().split(",");
            for (String s : arr1) {
                result = new StringBuilder("");
                result.append(s);
                result.delete(0, 1);
                result.delete(result.length() - 1, result.length());
                String[] arr2 = result.toString().split(":");
                result = new StringBuilder("");
                result.append(arr2[1]);
                result.delete(0, 1);
                newstr.append(result +"/");
            }
        }
        return newstr.toString();
    }

    public static StringBuilder stringCombiner(String newstring) {
        String str = newParsing(newstring);
        String[] arr1 = str.split("/");
        StringBuilder combine1 = new StringBuilder();
        combine1 = new StringBuilder(("Студент " + arr1[0] + " получил " + arr1[1] + " по предмету " + arr1[2] + ". \n"));
        StringBuilder combine2 = new StringBuilder();
        combine2 = new StringBuilder(("Студент " + arr1[3] + " получил " + arr1[4] + " по предмету " + arr1[5] + ". \n"));
        StringBuilder combine3 = new StringBuilder();
        combine3 = new StringBuilder(("Студент " + arr1[6] + " получил " + arr1[7] + " по предмету " + arr1[8] + ". \n"));
        StringBuilder result1 = new StringBuilder();
        result1.append(combine1);
        result1.append(combine2);
        result1.append(combine3);
        System.out.println(result1);
        return result1;
    }

    public static void stringWrite(String result) {
        StringBuilder str = new StringBuilder(String.valueOf(stringCombiner(result)));
        try (FileWriter in = new FileWriter("src/Sim2/test.txt")){
            in.append(str);
            System.out.println("Recorded");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
