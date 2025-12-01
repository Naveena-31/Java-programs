import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();   
        String result = "";
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = ch - '0';   
                if (digit % 2 == 1) {  
                    result += digit + " ";
                }
            }
        }
        if (result.equals("")) {
            System.out.println("-1");
        } else {
            System.out.println(result.trim());
        }
    }
}
