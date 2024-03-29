import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Boj_2075 {
    public static void main(String[] args) throws IOException {
        /*
        boj_2075 N번째 큰 수
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                queue.offer(Integer.parseInt(st.nextToken()));
            }
        }

        for(int i = 0; i < n-1; i++) {
            queue.poll();
        }
        System.out.println(queue.poll());
    }
}