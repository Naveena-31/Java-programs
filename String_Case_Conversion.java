import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z')
                r += (char)(c - 32);
            else if(c >= 'A' && c <= 'Z')
                r += (char)(c + 32);
            else
                r += c;
        }
        System.out.println(r);
    }
}
