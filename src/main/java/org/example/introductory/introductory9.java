package org.example.introductory;

import java.util.*;

public class introductory9 {
    class Solution {
        public int solution(int[] array) {
            Map<Integer, Integer> freqMap = new HashMap<>();

            for (int num : array) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }

            int maxFreq = 0;
            int mode = -1;
            boolean isMultiple = false;

            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();

                if (value > maxFreq) {
                    maxFreq = value;
                    mode = key;
                    isMultiple = false;
                } else if (value == maxFreq) {
                    isMultiple = true;
                }
            }

            return isMultiple ? -1 : mode;
        }
    }

}
