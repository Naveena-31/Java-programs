import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        boolean capitalizeNext = true;  
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                capitalizeNext = true; 
            } else {
                if (capitalizeNext) {
                    result = result + Character.toUpperCase(ch);
                    capitalizeNext = false;
                } else {
                    result = result + Character.toLowerCase(ch);
                }
            }
        }
        System.out.println(result);
    }
}
