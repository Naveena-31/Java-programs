import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder result = new StringBuilder();
        boolean spaceFound = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (!spaceFound) {      
                    result.append(c);
                    spaceFound = true;
                }
            } else {
                result.append(c);      
                spaceFound = false;
            }
        }
        System.out.println(result.toString().trim());
    }
}
