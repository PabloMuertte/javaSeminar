package Sim2.classtask;
// aaaabbbcdd
public class Task2 {
    public static String stringCompression(String arg) {
        int count = 1;
        String[] arr = arg.split("");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i==0){
                result.append(arr[i]);
                continue;
            }
            if (arr[i].equals(arr[i-1])){
                count++;
            } else if (count!=1) {
                result.append(count);
                count=1;
                result.append(arr[i]);
            } else {
                result.append(arr[i]);
            }
        }
        if (count!=1) result.append(count);
        return result.toString();
    }
}
