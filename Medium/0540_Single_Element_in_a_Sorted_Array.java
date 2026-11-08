/*
 * Problem: Single Element in a Sorted Array
 * Problem ID: 540
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 52.6 MB
 * Synced From: LeetCode
 * Date: 2026-11-08
 */

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(mid%2==1) {
                mid--;
            }
            if(nums[mid] == nums[mid + 1]) {
                // Pair is correct, single element is on right
                low = mid + 2;
            }
            else {
                // Pair is broken, single element is on left
                high = mid;
            }
        }
        return nums[low];
    }
}
