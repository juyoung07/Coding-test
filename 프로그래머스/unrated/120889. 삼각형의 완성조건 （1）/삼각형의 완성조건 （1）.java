class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        if(sides[2]<sides[0] && sides[0]<sides[1])
            answer = sides[2]+sides[0]>sides[1] ? 1 : 2;
        else if(sides[1]<sides[2] && sides[2]<sides[0])
            answer = sides[1]+sides[2]>sides[0] ? 1 : 2;
        else
            answer = sides[0]+sides[1]>sides[2] ? 1 : 2;
            
        return answer;
    }
}