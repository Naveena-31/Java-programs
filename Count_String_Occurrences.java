import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();   
        String S = sc.nextLine();          
        int count = 0;
        int n = l.length();
        int m = S.length();

        if (m == 0 || m > n) {
            System.out.println("-1");
            return;
        }
        for (int i = 0; i <= n - m; i++) {
            boolean mat = true;
            for (int j = 0; j < m; j++) {
                if (l.charAt(i + j) != S.charAt(j)) {
                    mat = false;
                    break;
                }
            }
            if (mat) {
                count++;
            }
        }
        if (count == 0)
            System.out.println("-1");
        else
            System.out.println(count);
    }
}
