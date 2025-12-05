import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
                while (num % i == 0) {
                    num/=i;
                }
            }
        }
        if (num > 1) {
            factors.add(num);
        }
        int idx=0;
        for (int f : factors) {
            idx++;
            System.out.print(f);
            if(idx<factors.size()){
                System.out.print(" ");
            }
        }
    }
}