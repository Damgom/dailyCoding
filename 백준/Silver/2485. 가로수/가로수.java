import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] tree = new int[n];
        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(br.readLine());
        }
        int gcd = 0;
        for (int i = 0; i < n - 1; i++) {
            int distance = tree[i + 1] - tree[i];
            gcd = gcd(distance, gcd);
        }
        System.out.println((tree[n - 1] - tree[0]) / gcd + 1 - (tree.length) + "");
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}