class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n % 2 == 0 ? n / 2 : n / 2 + 1];
        int a = 1;
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = a;
            a += 2;
        }
        
        return answer;
    }
}