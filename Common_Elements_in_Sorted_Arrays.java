import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < N; i++)
            setA.add(sc.nextInt());
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (setA.contains(x))
                result.add(x);
        }
        if (result.isEmpty()) {
            System.out.println("-1");
            return;
        }
        List<Integer> list = new ArrayList<>(result);
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(list.get(i));
        }
    }
}
