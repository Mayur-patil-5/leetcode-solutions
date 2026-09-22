/*
 * Problem: Max Consecutive Ones
 * Problem ID: 485
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms
 * Memory: 52.5 MB
 * Synced From: LeetCode
 * Date: 2026-09-22
 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int maxi=0;
        int cnt=0;
        for(int i=0;i<n;i++){
          if(nums[i]==1){
                cnt++;
                maxi=Math.max(maxi,cnt);
            }
            else{
                cnt=0;
            }
        }
        return maxi;
    }
}