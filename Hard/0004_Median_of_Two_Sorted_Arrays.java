/*
 * Problem: Median of Two Sorted Arrays
 * Problem ID: 4
 * Difficulty: Hard
 * Language: Java
 * Runtime: 7 ms
 * Memory: 49.1 MB
 * Synced From: LeetCode
 * Date: 2026-09-18
 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m + n];
        int index = 0;
        // nums1 ko arr mein daalo
        for (int i = 0; i < m; i++) {
            arr[index] = nums1[i];
            index++;
        }
        // nums2 ko arr mein daalo
        for (int i = 0; i < n; i++) {
            arr[index] = nums2[i];
            index++;
        }
        Arrays.sort(arr);
        int total = m + n;
        if (total % 2 == 1) {
            return arr[total / 2];
        } else {
            return (arr[total / 2 - 1] + arr[total / 2]) / 2.0;
        }
    }
}