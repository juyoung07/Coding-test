class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int multiply = 1;
        
        for(int i=0; i<answer.length; i++){
            answer[i] = k*multiply;
            multiply++;
        }
        return answer;
    }
}