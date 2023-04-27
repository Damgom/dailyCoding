import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<Integer> set = new TreeSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            set.remove(Integer.parseInt(st.nextToken()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(set.size()).append("\n");
        for (int num : set) {
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}
