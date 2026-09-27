/*
 * Problem: Merge Sorted Array
 * Problem ID: 88
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms
 * Memory: 44.1 MB
 * Synced From: LeetCode
 * Date: 2026-09-27
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}