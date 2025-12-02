import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }
        int minVal = arr[0];
        int minIndex = 0;
        for (int i = 1; i < M; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
                minIndex = i;
            }
        }
        if (minIndex == 0) {
            System.out.println("-1");
        } else {
            System.out.println(minIndex);
        }
    }
}
