/*
 * Problem: Jump Game
 * Problem ID: 55
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms
 * Memory: 47.5 MB
 * Synced From: LeetCode
 * Date: 2026-08-11
 */

class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
        if (i > maxReach) {
        return false;
    }
    maxReach = Math.max(maxReach, i + nums[i]);
    if (maxReach >= nums.length - 1) {
        return true;
    }
}
return false;       
   }
}