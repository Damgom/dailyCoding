import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_2477 {
    public static void main(String[] args) throws IOException {
        /*
        boj_2477 실버3 수학, 구현 실버3
        사각형을 만들수 있는 모든 경우의수를 더해주고
        가장 큰 사각형을 두 번 빼줌
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        List<Integer> length = new ArrayList<>();
        for(int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            length.add(Integer.parseInt(st.nextToken()));
        }

        int volume = 0;
        int newVolume = 0;
        for(int i = 0; i < 5; i++) {
            int temp = length.get(i) * length.get(i+1);
            if(temp > volume) {
                volume = temp;
            }
            newVolume += temp;
        }
        newVolume += length.get(0) * length.get(5);
        if(length.get(0) * length.get(5) > volume) {
            volume = length.get(0) * length.get(5);
        }

        System.out.println(k * (newVolume - 2 * volume));
    }
}