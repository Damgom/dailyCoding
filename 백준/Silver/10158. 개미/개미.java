import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(br.readLine());
        int x = (p + t) % (w * 2);
        int y = (q + t) % (h * 2);
        if (x > w) {
            x = 2 * w - x;
        }
        if (y > h) {
            y = 2 * h - y;
        }
        System.out.printf("%d %d", x, y);
    }
}