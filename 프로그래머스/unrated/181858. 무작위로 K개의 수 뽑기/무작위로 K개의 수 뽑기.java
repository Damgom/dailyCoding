import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i]) && list.size() < k) {
                list.add(arr[i]);
            }
        }
        while (list.size() < k) {
            list.add(-1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}