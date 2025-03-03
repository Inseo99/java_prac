package org.example.basic;

public class basic10 {
    class Solution {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int a = (numer1 * denom2) + (numer2 * denom1);
            int b = denom1 * denom2;

            int gcd = gcd(a, b);

            return new int[] {a / gcd, b / gcd};
        }

        private int gcd(int x, int y) {
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }
            return x;
        }
    }
}
