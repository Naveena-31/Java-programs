import java.util.Scanner;
public class Main {
    static boolean isPrime(int num){
        if(num==1) return false;
        if(num==2) return true;
        if(num%2==0) return false;
        for(int i=3;i*i<=num;i+=2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int count=0;
        for(int i=l;i<=r;i++){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}