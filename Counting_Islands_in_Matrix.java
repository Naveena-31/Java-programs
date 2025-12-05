import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                mat[i][j] = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == 1) {
                    boolean isIsland = true;
                    if (i > 0 && mat[i - 1][j] == 1) isIsland = false;
                    if (i < N - 1 && mat[i + 1][j] == 1) isIsland = false;
                    if (j > 0 && mat[i][j - 1] == 1) isIsland = false;
                    if (j < N - 1 && mat[i][j + 1] == 1) isIsland = false;
                    if (isIsland) count++;
                }
            }
        }
        System.out.println(count == 0 ? -1 : count);
    }
}
