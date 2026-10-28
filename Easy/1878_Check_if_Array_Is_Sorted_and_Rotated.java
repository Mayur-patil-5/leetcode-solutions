/*
 * Problem: Check if Array Is Sorted and Rotated
 * Problem ID: 1878
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.1 MB
 * Synced From: LeetCode
 * Date: 2026-10-28
 */

class Solution {
    public boolean check(int[] nums) {
        int count=0;
       int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }
        if(count<=1){
            return true;
        }
        return false;
    }
}