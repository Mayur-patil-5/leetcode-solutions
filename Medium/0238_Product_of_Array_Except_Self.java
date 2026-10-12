/*
 * Problem: Product of Array Except Self
 * Problem ID: 238
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms
 * Memory: 72.3 MB
 * Synced From: LeetCode
 * Date: 2026-10-12
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n=nums.length;
       int arr[]=new int[n];
       int leftprod=1;
       for(int i=0;i<n;i++){
         arr[i]=leftprod;
         leftprod*=nums[i];
       }
       int rightprod=1;
       for(int i=n-1;i>=0;i--){
        arr[i]*=rightprod;
        rightprod*=nums[i];
       }
       return arr;
    }
}