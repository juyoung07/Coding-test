class Solution {
    public String solution(String letter) {
        String answer = "";
        String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                          "....", "..", ".---", "-.-", ".-..", "--", "-.", 
                          "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                          "...-", ".--", "-..-", "-.--", "--.." };
        String splitedLetter[] = letter.split(" ");
        
        for (int i = 0; i < splitedLetter.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (splitedLetter[i].equals(morse[j])) {
                    answer += (char)('a' + j);
                    break;
                }
            }
        }
            
        return answer;
    }
}