import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   
        int K = sc.nextInt();   
        int count = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x == K) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("-1");
        }
    }
}
