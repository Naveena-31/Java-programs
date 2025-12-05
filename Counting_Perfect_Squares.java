import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int count = 0;
        int start = (int)Math.ceil(Math.sqrt(L));
        int end = (int)Math.floor(Math.sqrt(R));
        if (start > end) {
            System.out.println(-1);
        } else {
            count = end - start + 1;
            System.out.println(count);
        }
    }
}
