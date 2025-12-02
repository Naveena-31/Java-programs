import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();      
        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';   
            sum += (long)digit * digit;      
        }
        System.out.println(sum);
    }
}
