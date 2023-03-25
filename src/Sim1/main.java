package Sim1;

import Sim1.task.*;

public class main {
    public static void main(String[] args) {
        int num1 = Hometask4.getInt();
        int num2 = Hometask4.getInt();
        char operation = Hometask4.getOperation();
        int result = Hometask4.calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }
}
