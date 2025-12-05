import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (s1.length() != s2.length()) {
            System.out.println("no");
            return;
        }
        int[] map1 = new int[256];  
        int[] map2 = new int[256];  
        Arrays.fill(map1, -1);
        Arrays.fill(map2, -1);
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (map1[c1] == -1 && map2[c2] == -1) {
                map1[c1] = c2;
                map2[c2] = c1;
            }
            else if (map1[c1] != c2) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}