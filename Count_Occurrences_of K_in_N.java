import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        if (N == 0 && K == 0) {
            System.out.println(1);
            return;
        }
        while (N > 0) {
            int digit = N % 10;
            if (digit == K) count++;
            N /= 10;
        }
        System.out.println(count == 0 ? -1 : count);
    }
}
