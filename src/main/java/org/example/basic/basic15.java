package org.example.basic;

public class basic15 {
    class Solution {
        public int solution(int a, int b) {
            int num1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
            int num2 = 2 * a * b;

            return num1 >= num2 ? num1 : num2;
        }
    }
}
