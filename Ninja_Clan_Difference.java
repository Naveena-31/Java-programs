import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kabali = sc.nextInt();
        int opponent = sc.nextInt();
        System.out.println(Math.abs(opponent - kabali));
    }
}
