import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (set.contains(X - a)) {
                System.out.println("yes");
                return;
            }
            set.add(a);
        }
        System.out.println("no");
    }
}
