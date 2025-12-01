import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        int n=s.length();
        if(n%2==1){
            int mid=n/2;
            s=s.substring(0,mid)+"*"+s.substring(mid+1);
            
        }else{
            int mid1=n/2-1;
            int mid2=n/2;
            s=s.substring(0,mid1)+"**"+s.substring(mid2+1);
        }
        System.out.println(s);
    }
}