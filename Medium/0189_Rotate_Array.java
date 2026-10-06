/*
 * Problem: Rotate Array
 * Problem ID: 189
 * Difficulty: Medium
 * Language: Java
 * Runtime: 7 ms
 * Memory: 273.3 MB
 * Synced From: LeetCode
 * Date: 2026-10-06
 */

class Solution {
    public void rotate(int[] nums, int k) {
       int n=nums.length;
       int temp[]=new  int[n];
       for(int i=0;i<n;i++){
          int newindex=(i+k)%n;
          temp[newindex] = nums[i];
       }
       for(int i=0;i<n;i++){
        nums[i]=temp[i];
       }
    }
}