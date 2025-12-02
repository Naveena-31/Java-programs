import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 1; 
        int prev = arr[0];
        if(K == 1){
            System.out.println(prev);
            return;
        }
        for(int i = 1; i < N; i++){
            if(arr[i] != prev){
                count++;
                prev = arr[i];
                if(count == K){
                    System.out.println(prev);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
