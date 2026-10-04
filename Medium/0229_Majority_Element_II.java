/*
 * Problem: Majority Element II
 * Problem ID: 229
 * Difficulty: Medium
 * Language: Java
 * Runtime: 15 ms
 * Memory: 52.9 MB
 * Synced From: LeetCode
 * Date: 2026-10-04
 */

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for(int num : freq.keySet()){
            if(freq.get(num) > n / 3){
                list.add(num);
            }
        }
        return list;
    }
}