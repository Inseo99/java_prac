package org.example.introductory;

public class introductory14 {
    class Solution {
        public int solution(int n) {
            return ((n * 6) / gcd(n, 6))/6;
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}

