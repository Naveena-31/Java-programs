import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int balance = 0;
        boolean isBalanced = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance < 0) { 
                    isBalanced = false;
                    break;
                }
            }
        }
        if (balance != 0) isBalanced = false;
        System.out.println(isBalanced ? "yes" : "no");
    }
}
