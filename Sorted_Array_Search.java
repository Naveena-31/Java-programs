import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long[] arr = new long[(int)N];  
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }
        int low = 0, high = (int)N - 1;
        boolean found = false;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == K) {
                found = true;
                break;
            }
            if (arr[mid] < K)
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println(found ? "yes" : "no");
    }
}
