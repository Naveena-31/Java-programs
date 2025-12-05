import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) {
            System.out.println("-1");
            return;
        }
        int N = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= N; i += 2) {
            if (N % i == 0) {
                sb.append(i).append(' ');
            }
        }
        if (sb.length() == 0) {
            System.out.println("-1");
        } else {
            sb.setLength(sb.length() - 1);
            System.out.println(sb.toString());
        }
    }
}
