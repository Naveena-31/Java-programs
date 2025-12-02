import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int oddCount = 0, evenCount = 0;
        int oddNumber = -1, evenNumber = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evenCount++;
                evenNumber = arr[i];
            } else {
                oddCount++;
                oddNumber = arr[i];
            }
        }
        if (evenCount == 1) {
            System.out.println(evenNumber);   
        } else if (oddCount == 1) {
            System.out.println(oddNumber);    
        } else {
            System.out.println(-1);           
        }
    }
}
