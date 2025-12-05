import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i += 2) {
            char temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
        System.out.println(new String(arr));
    }
}