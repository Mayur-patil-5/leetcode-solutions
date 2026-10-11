/*
 * Problem: Sum of Squares of Special Elements 
 * Problem ID: 2844
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 46.6 MB
 * Synced From: LeetCode
 * Date: 2026-10-11
 */

class Solution {
    public int sumOfSquares(int[] nums) {
        int len=nums.length;
        int sum=0;
        for(int i=0;i<len;i++){
            if(len%(i+1) == 0){
                sum+=(nums[i]*nums[i]);
            }
        }
        return sum;
    }
}