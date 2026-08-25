/*
 * Problem: Smallest Missing Multiple of K
 * Problem ID: 4080
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 44.9 MB
 * Synced From: LeetCode
 * Date: 2026-08-25
 */

class Solution {
    public int missingMultiple(int[] nums, int k) {
        int mul=k;
        while(true){
            boolean found=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==mul){
                found=true;
                break;
            }
        }
            if(!found){
                return mul;
            }
            mul +=k;
        }
    }
}