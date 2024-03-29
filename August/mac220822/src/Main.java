import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N];

        dp[0] = 1;
        int result = 1;
        for(int i = 1; i < N; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j] && dp[i] <= dp[j]){
                    dp[i] = dp[j] + 1;
                }
            }
            result = Math.max(result, dp[i]);
        }
        System.out.println(result);
    }
}