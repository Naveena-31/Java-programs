import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
        int count = 0;
        int idx = -1;
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                count++;
                idx = i;  
            }
        }
        if (count == 0) {
            System.out.println(-1);
            return;
        }
        if (count > 1) {
            System.out.println(-1);
            return;
        }
        if (idx == 0 || arr[idx - 1] < arr[idx + 1]) {
            System.out.println(idx);
        } else {
            System.out.println(idx + 1);
        }
    }
}
