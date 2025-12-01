import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int product = N * M;
        int sq = (int)Math.sqrt(product);
        if (sq * sq == product) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
