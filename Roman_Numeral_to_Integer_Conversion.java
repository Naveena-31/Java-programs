import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = value(s.charAt(i));
            if (curr == -1) {    
                System.out.println(-1);
                return;
            }
            if (i + 1 < s.length()) {
                int next = value(s.charAt(i + 1));
                if (next == -1) {    
                    System.out.println(-1);
                    return;
                }
                if (next > curr) {
                    ans += next - curr;
                    i++;
                    continue;
                }
            }
            ans += curr;
        }
        System.out.println(ans);
    }
    static int value(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        return -1;
    }
}
