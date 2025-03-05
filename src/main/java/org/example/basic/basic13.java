package org.example.basic;

public class basic13 {
    class Solution {
        public StringBuilder solution(String my_string, int k) {
            StringBuilder answer = new StringBuilder();

            for (int i = 0; i < k; i++) {
                answer.append(my_string);
            }

            return answer;
        }
    }
}
