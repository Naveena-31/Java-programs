import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();  
        long sum = K * (K + 1) / 2;
        System.out.println(sum);
        sc.close();
    }
}
