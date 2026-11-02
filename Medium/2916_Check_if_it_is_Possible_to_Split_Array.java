/*
 * Problem: Check if it is Possible to Split Array
 * Problem ID: 2916
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms
 * Memory: 43.8 MB
 * Synced From: LeetCode
 * Date: 2026-11-02
 */

class Solution {
    public boolean canSplitArray(List<Integer> nums, int m) {
        if(nums.size()<=2){
            return true;
        }
        for(int i=1;i<nums.size();i++){
            if(nums.get(i)+nums.get(i-1)>=m){
                return true;
            }
        }
        return false;
    }
}