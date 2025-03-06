package org.example.introductory;

public class introductory13 {
    class Solution {
        public int solution(int n) {

            if (n%7 > 0) {
                return (int) Math.ceil((double) n/7);
            }

            return n/7;
        }
    }
}
