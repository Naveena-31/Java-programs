import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        int f=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                 f=1;
                 break;
             }else{
                 f=0;
             }
        }
        if(f==1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}