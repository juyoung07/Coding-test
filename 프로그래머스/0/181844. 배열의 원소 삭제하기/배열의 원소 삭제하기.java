import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            list.add(a);
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j])
                    list.remove(Integer.valueOf(arr[i]));
            }
        }
        
        int answer[] = new int[list.size()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);
        
        
        return answer;
    }
}