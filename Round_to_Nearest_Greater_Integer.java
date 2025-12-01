import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float n = obj.nextFloat();
        System.out.println((int)Math.ceil(n));
    }
}