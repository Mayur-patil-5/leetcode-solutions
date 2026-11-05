/*
 * Problem: Find the Distance Value Between Two Arrays
 * Problem ID: 1486
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms
 * Memory: 45.6 MB
 * Synced From: LeetCode
 * Date: 2026-11-05
 */

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean isValid = true;
            for (int j = 0; j < arr2.length; j++) {
                int result = Math.abs(arr1[i] - arr2[j]);
                if (result <= d) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                res++;
            }
        }
        return res;
    }
}