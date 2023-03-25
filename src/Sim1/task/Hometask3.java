package Sim1.task;

public class Hometask3 {
    public static void simpleDigit() {
        int n = 1000;
        boolean b = true;
        for (int P = 2; P <= n; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(P);
            else b = true;
        }
    }
}
