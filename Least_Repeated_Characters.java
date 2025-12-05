import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] count = new int[256];
        for(char c : s.toCharArray()) {
            if(c != ' ') 
                count[c]++;
        }
        int min = Integer.MAX_VALUE;
        for(char c : s.toCharArray()) {
            if(c != ' ')
                min = Math.min(min, count[c]);
        }
        boolean[] printed = new boolean[256];
        for(char c : s.toCharArray()) {
            if(c != ' ' && count[c] == min && !printed[c]) {
                System.out.print(c);
                printed[c] = true;
            }
        }
    }
}
