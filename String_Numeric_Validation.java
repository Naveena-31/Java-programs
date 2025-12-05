import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isNumeric = true;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                isNumeric = false;
                break;
            }
        }
        if (isNumeric)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
