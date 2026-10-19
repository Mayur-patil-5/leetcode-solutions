/*
 * Problem: Find Target Indices After Sorting Array
 * Problem ID: 2210
 * Difficulty: Easy
 * Language: Java
 * Runtime: 7 ms
 * Memory: 50.1 MB
 * Synced From: LeetCode
 * Date: 2026-10-19
 */

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums);
            if(nums[i]==target){
                list.add(i);
            }
        }
        return list;
    }
}