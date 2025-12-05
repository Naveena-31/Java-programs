import java.util.*;
class Main {
    static boolean[] visited;
    static int[][] arr;
    static int n;
    static void dfs(int i) {
        visited[i] = true;
        for (int j = 0; j < n; j++) {
            if (!visited[j] && (arr[i][0] == arr[j][0] || arr[i][1] == arr[j][1])) {
                dfs(j);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][2];
        visited = new boolean[n];
        for(int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int components = 0;
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                components++;
                dfs(i);
            }
        }
        System.out.println(components - 1);
    }
}
