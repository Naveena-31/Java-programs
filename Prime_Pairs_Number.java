import java.util.*;
class Main {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean found = false;
        for (int i = N; i >= 2; i--) {
            if (isPrime(i)) {
                if (N % i == 0) {
                    int j = N / i;
                    if (isPrime(j)) {
                        System.out.print(i + " " + j);
                        found = true;
                        break; 
                    }
                }
            }
        }
        if (!found) {
            System.out.print("-1");
        }
    }
}
