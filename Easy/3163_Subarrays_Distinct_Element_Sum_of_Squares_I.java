/*
 * Problem: Subarrays Distinct Element Sum of Squares I
 * Problem ID: 3163
 * Difficulty: Easy
 * Language: Java
 * Runtime: 5 ms
 * Memory: 44.9 MB
 * Synced From: LeetCode
 * Date: 2026-10-15
 */

class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int ans=0;
        for(int i = 0; i < n; i++) {
            int count=0;
         boolean[] seen = new boolean[101];
        for (int j = i; j < n; j++) {
        if(!seen[nums.get(j)]) {
            count++;
            seen[nums.get(j)] = true;
        }
        ans += count * count;
    }
    }
    return ans;
}
}