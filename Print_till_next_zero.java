import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int f = -1;
        int s = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 0) {
                if (f == -1)
                    f = i;
                else {
                    s = i;
                    break;
                }
            }
        }
        if (f == -1 || s == -1) {
            System.out.println("-1");
            return;
        }
        if (s == f + 1) {
            System.out.println("-1");
            return;
        }
        for (int i = f + 1; i < s; i++) {
            System.out.print(arr[i]);
            if (i < s - 1) System.out.print(" ");
        }
    }
}
