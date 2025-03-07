package org.example.basic;

public class basic22 {
    class Solution {
        public int solution(int a, int d, boolean[] included) {
            int answer = 0;
            int result = 0;

            for (int i = 0; i < included.length; i++) {
                if (i == 0) {
                    result = a;
                    if (included[i]) {
                        answer += result;
                    }
                } else {
                    result += d;
                    if (included[i]) {
                        answer += result;
                    }
                }
            }

            return answer;
        }
    }
}
