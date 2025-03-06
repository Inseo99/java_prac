package org.example.basic;

public class basic18 {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            if (n%2 == 1) {
                for (int i = 1; i <= n; i = i + 2) {
                    answer = answer + i;
                }
            } else {
                for (int i = 2; i <= n; i = i + 2) {
                    answer = answer + (i * i);
                }
            }

            return answer;
        }
    }
}
