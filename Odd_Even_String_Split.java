import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String evenStr="";
        String oddStr="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                evenStr+=s.charAt(i);
            }
            else{
                oddStr+=s.charAt(i);
            }
        }
        System.out.println(evenStr+" "+oddStr);
    }
}