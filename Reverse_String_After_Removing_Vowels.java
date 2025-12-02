import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        char[] temp = new char[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (vowels.indexOf(arr[i]) == -1) {
                temp[idx++] = arr[i];
            }
        }
        if (idx == 0) {
            System.out.println("-1");
            return;
        }
        for (int i = idx - 1; i >= 0; i--) {
            System.out.print(temp[i]);
        }
    }
}
