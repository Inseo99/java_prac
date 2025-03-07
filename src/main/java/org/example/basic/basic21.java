package org.example.basic;

public class basic21 {
    class Solution {
        public String solution(String code) {
            String answer = "";
            int mode = 0;
            String[] word = code.split("");

            for (int i = 0; i < word.length; i++) {
                if (word[i].equals("1")) {
                    mode = (mode == 0) ? 1 : 0;
                    continue;
                } else if(mode == 0 && i%2 == 0){
                    answer += word[i];
                } else if(mode == 1 && i%2 == 1) {
                    answer += word[i];
                } else if(answer == "") {
                    answer += "EMPTY";
                }
            }

            return answer.isEmpty() ? "EMPTY" : answer;
        }
    }
}
