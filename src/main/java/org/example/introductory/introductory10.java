package org.example.introductory;

import java.util.ArrayList;

public class introductory10 {
    class Solution {
        public ArrayList<Integer> solution(int n) {
            ArrayList<Integer> answer = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (i%2 == 1) {
                    answer.add(i);
                }
            }

            return answer;
        }
    }
}
