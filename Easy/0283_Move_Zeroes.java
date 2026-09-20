/*
 * Problem: Move Zeroes
 * Problem ID: 283
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms
 * Memory: 48.1 MB
 * Synced From: LeetCode
 * Date: 2026-09-20
 */


class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
    }
}