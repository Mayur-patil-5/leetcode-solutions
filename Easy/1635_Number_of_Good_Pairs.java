/*
 * Problem: Number of Good Pairs
 * Problem ID: 1635
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 42.9 MB
 * Synced From: LeetCode
 * Date: 2026-07-05
 */

class Solution {
    public static int numIdenticalPairs(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}