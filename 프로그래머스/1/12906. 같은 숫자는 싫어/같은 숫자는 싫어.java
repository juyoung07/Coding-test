import java.util.Stack;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) stack.push(arr[i]);
            else if (stack.peek() != arr[i]) stack.push(arr[i]);
        }
        
        int answer[] = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        
        return answer;
    }
}