import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,res;
        n1=sc.nextInt();
        n2=sc.nextInt();
        res=gcd(n1,n2);
        System.out.println(res);
    }
    static int gcd(int a,int b){
        if((a==0)||(b==0)) return -1;
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
