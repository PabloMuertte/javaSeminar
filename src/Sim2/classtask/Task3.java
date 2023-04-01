package Sim2.classtask;

import java.io.FileWriter;
import java.io.IOException;

//metod which create string with 100 words TEST and write it in text file
public class Task3 {
    private static String createTESTString(String arg){
//return String.valueOf(arg).repeat(100); Can make it easier
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(arg);

        }
        return sb.toString();
    }

    public static void stringWrite(String arg) {
        String str = createTESTString(arg);
        try (FileWriter in = new FileWriter("Sim2/test.txt")){
            in.append(str);
            System.out.println("Recorded");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
