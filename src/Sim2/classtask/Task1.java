package Sim2.classtask;

public class Task1 {
    public static String getrepeatString(int numN) {
        StringBuilder sb = new StringBuilder();
        sb.append("c1");
        for (int i = 0; i < (numN-1) ; i++) {
            if (i % 2 ==0) sb.append("c2");
            else sb.append("c1");
        }
        return sb.toString();
    }
}
