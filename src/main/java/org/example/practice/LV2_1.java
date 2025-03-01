package org.example.practice;

import java.util.Arrays;

public class LV2_1 {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }
}

class Solution {
    int MIN = Integer.MAX_VALUE;
    int MAX = Integer.MIN_VALUE;

    public String solution(String s) {
        String [] split = s.split(" ");
        for(String cur : split){
            int check = Integer.parseInt(cur);
            MIN = Math.min(MIN, check);
            MAX = Math.max(MAX, check);
        }
        return MIN + " " + MAX;
    }
}