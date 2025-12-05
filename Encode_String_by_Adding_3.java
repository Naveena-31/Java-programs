import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        for(char c: s.toCharArray()){
            if(c>='a' && c<='z'){
                res=res+(char)((c - 'a' + 3) % 26 + 'a')+"";
            }
            else if(c>='A' && c<='Z'){
                res=res+(char)((c - 'A' + 3) % 26 + 'A')+"";
            }
            else{
                res+=c;
            }
        }
        System.out.println(res);
    }
}