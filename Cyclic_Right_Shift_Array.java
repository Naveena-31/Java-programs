import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        K = K % N;  
        int[] res = new int[N];
        int idx = 0;
        for (int i = N - K; i < N; i++) {
            res[idx++] = arr[i];
        }
        for (int i = 0; i < N - K; i++) {
            res[idx++] = arr[i];
        }
        for (int i = 0; i < N; i++) {
            System.out.print(res[i]);
            if (i < N - 1) System.out.print(" ");
        }
    }
}
