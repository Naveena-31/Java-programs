import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 2) {
            System.out.println("-1");
            return;
        }
        int s = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x < s) {
                min = s;
                s = x;
            } else if (x > s && x < min) {
                min = x;
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(min);
        }
    }
}
