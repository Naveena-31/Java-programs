import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int s = obj.nextInt();
        if(isPrime(s)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
            return true;
    }
}