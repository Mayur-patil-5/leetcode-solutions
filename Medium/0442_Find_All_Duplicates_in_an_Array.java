/*
 * Problem: Find All Duplicates in an Array
 * Problem ID: 442
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms
 * Memory: 62.2 MB
 * Synced From: LeetCode
 * Date: 2026-09-15
 */

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];  //0 to n indexes that ehy n+1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (freq[i] > 1) {
                list.add(i);
            }
        }
        return list;
    }
}