/*
 * Problem: Largest Number At Least Twice of Others
 * Problem ID: 748
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.7 MB
 * Synced From: LeetCode
 * Date: 2026-10-26
 */

class Solution {
    public int dominantIndex(int[] nums) {
        int largest=-1;
        int secondlargest=-1;
        int index=-1;
        for (int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                secondlargest=largest;
                largest=nums[i];
                index=i;
            }else if(nums[i]>secondlargest) {
                secondlargest=nums[i];
            }
        }
        if(largest>=2*secondlargest){
            return index;
        }
        return -1;
    }
}