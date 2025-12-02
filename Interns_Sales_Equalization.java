import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int sumA = 0, sumB = 0;
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
            sumA += A[i];
        }
        for(int i = 0; i < n; i++){
            B[i] = sc.nextInt();
            sumB += B[i];
        }
        int diff = sumA - sumB;
        if(diff % 2 != 0){
            System.out.println("no");
            return;
        }
        int target = diff / 2;
        HashSet<Integer> setB = new HashSet<>();
        for(int x : B) setB.add(x);
        for(int i = 0; i < n; i++){
            if(setB.contains(A[i] - target)){
                System.out.println("yes");
                return;
            }
        }
        System.out.println("no");
    }
}
