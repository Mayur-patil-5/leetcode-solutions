/*
 * Problem: Single Number II
 * Problem ID: 137
 * Difficulty: Medium
 * Language: Java
 * Runtime: 6 ms
 * Memory: 46.5 MB
 * Synced From: LeetCode
 * Date: 2026-09-17
 */

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for(int num : nums) {
            if(freq.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}