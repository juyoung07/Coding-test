import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        
        
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                list.add(num);
            }
        }
        
        int answer[] = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}