import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int res=1;
        for(int i=l;i<=(l*r);i++){
            if((i%l==0)&&(i%r==0)){
                res=i;
                break;
            }
        }
        System.out.println(res);
    }
}