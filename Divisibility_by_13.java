import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if(n%13==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}