import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int tsa = 2 * (L*B + B*H + L*H);
        int volume = L * B * H;
        System.out.println(tsa + " " + volume);
    }
}
