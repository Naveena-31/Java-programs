import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();        
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < Y; i++) {
            int x = sc.nextInt();
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        int T = sc.nextInt();   
        for (int i = 0; i < T; i++) {
            int q = sc.nextInt();
            if (freq.containsKey(q)) {
                System.out.print(freq.get(q));
            } else {
                System.out.print("Not Present");
            }
            if (i < T - 1) System.out.print(" ");  
        }
    }
}
