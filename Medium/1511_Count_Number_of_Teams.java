/*
 * Problem: Count Number of Teams
 * Problem ID: 1511
 * Difficulty: Medium
 * Language: Java
 * Runtime: 15 ms
 * Memory: 43.7 MB
 * Synced From: LeetCode
 * Date: 2026-10-09
 */

// 


class Solution {
    public int numTeams(int[] rating) {
        int count = 0;
        int n = rating.length;

        for (int j = 0; j < n; j++) {
            int leftSmall = 0;
            int leftLarge = 0;
            int rightSmall = 0;
            int rightLarge = 0;

            for (int i = 0; i < j; i++) {
                if (rating[i] < rating[j]) {
                    leftSmall++;
                } else if (rating[i] > rating[j]) {
                    leftLarge++;
                }
            }

            for (int k = j + 1; k < n; k++) {
                if (rating[k] < rating[j]) {
                    rightSmall++;
                } else if (rating[k] > rating[j]) {
                    rightLarge++;
                }
            }

            count += leftSmall * rightLarge;
            count += leftLarge * rightSmall;
        }

        return count;
    }
}