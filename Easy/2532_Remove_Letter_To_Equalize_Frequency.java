/*
 * Problem: Remove Letter To Equalize Frequency
 * Problem ID: 2532
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.1 MB
 * Synced From: LeetCode
 * Date: 2026-10-30
 */

class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];

        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word.length(); i++) {
            int[] temp = freq.clone();

            temp[word.charAt(i) - 'a']--;

            int count = 0;
            int target = 0;
            boolean flag = true;

            for (int j = 0; j < 26; j++) {
                if (temp[j] > 0) {
                    if (target == 0) {
                        target = temp[j];
                    } else if (temp[j] != target) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                return true;
            }
        }

        return false;
    }
}