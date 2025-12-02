import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();  
        long product = 1;
        while (n > 0) {
            long digit = n % 10;  
            product *= digit;     
            n /= 10;              
        }
        System.out.println(product);
        sc.close();
    }
}
