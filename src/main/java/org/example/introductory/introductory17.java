package org.example.introductory;

public class introductory17 {
    class Solution {
        public int[] solution(int money) {
            int[] answer = new int[2];

            answer[0] = money / 5500;
            answer[1] = money % 5500;

            return answer;
        }
    }
}

