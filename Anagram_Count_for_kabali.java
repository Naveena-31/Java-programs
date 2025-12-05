import java.util.*;
public class Main {
    static int[] getFreq(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        String target = "kabali";
        int[] targetFreq = getFreq(target);
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            if (str.length() != target.length())
                continue;
            int[] currFreq = getFreq(str);
            if (Arrays.equals(currFreq, targetFreq)) {
                count++;
            }
        }
        System.out.println(count);
    }
}