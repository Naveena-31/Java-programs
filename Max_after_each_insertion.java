import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int N = sc.nextInt();
        int K = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (!sc.hasNextInt()) return;
            int v = sc.nextInt();
            if (v > max) max = v;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < K; i++) {
            if (!sc.hasNextInt()) break; 
            int ins = sc.nextInt();
            if (ins > max) max = ins;
            if (sb.length() > 0) sb.append(' ');
            sb.append(max);
        }
        System.out.println(sb.toString()); 
        sc.close();
    }
}
