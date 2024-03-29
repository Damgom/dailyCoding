import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11048 {
    public static void main(String[] args) throws IOException {
        /*
        boj_11048 이동하기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n+1][m+1];
        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                arr[i][j] += Math.max(arr[i][j-1], Math.max(arr[i-1][j], arr[i-1][j-1]));
            }
        }
//        for(int i = 1; i <= n; i++) {
//            for(int j = 1; j <= m; j++) {
//                arr[i][j] += Math.max(arr[i][j-1], Math.max(arr[i-1][j], arr[i-1][j-1]));
//            }
//        }
        System.out.println(arr[n][m]);
    }
}