import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sen=sc.nextLine();
        String[] word=sen.split(" ");
        int i=0;
        for(String w:word){
            i++;
            String rev=reverse(w);
            System.out.print(rev);
            if(i<word.length){
                System.out.print(" ");
            }
        }
    }
    static String reverse(String s){
        String rev="";
        int len=s.length();
        if(len==1){
            return s;
        }
        rev+=s.charAt(0);
        for(int i=len-2;i>=1;i--){
            rev+=s.charAt(i);
        }
        rev+=s.charAt(len-1);
        return rev;
    }
}
