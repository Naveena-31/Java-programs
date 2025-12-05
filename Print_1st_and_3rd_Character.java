import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() >= 3) {
            System.out.print("" + s.charAt(0) + s.charAt(2));
        } else if (s.length() == 2) {
            System.out.print("" + s.charAt(0));
        } else {
            System.out.print(s);
        }
    }
}
