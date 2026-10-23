/*
 * Problem: Maximum K to Sort a Permutation
 * Problem ID: 3950
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms
 * Memory: 110.3 MB
 * Synced From: LeetCode
 * Date: 2026-10-23
 */

class Solution {
    public int sortPermutation(int[] nums) {
        int k=Integer.MAX_VALUE;
        boolean flag=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                flag = false;
                k &= i;
            }
        }
        if(flag == true) return 0;
        return k;
    }
}