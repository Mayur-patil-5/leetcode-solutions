/*
 * Problem: Longest Mountain in Array
 * Problem ID: 875
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms
 * Memory: 47.5 MB
 * Synced From: LeetCode
 * Date: 2026-08-19
 */

class Solution {
    public int longestMountain(int[] arr) {

        int max = 0;

        for(int i = 1; i < arr.length - 1; i++) {

            // peak check
            if(arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {

                int left = i;
                int right = i;

                // left side
                while(left > 0 && arr[left - 1] < arr[left]) {
                    left--;
                }

                // right side
                while(right < arr.length - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                max = Math.max(max, right - left + 1);
            }
        }

        return max;
    }
}