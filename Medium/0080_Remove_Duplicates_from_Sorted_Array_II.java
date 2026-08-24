/*
 * Problem: Remove Duplicates from Sorted Array II
 * Problem ID: 80
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 48.8 MB
 * Synced From: LeetCode
 * Date: 2026-08-24
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(k<2 || nums[i]!=nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}