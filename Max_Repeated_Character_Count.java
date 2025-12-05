import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count,max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            count=1;
            for(int j=i+1;j<s.length();j++){
                char k=s.charAt(j);
                if(ch==k){
                    count++;
                }
            }
            if(max<count){
                max=count;
            }
        }
        if(max<=1){
            System.out.println("0");
        }
        else{
            System.out.println(max);
        }
    }
}