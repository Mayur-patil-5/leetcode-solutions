/*
 * Problem: Largest Number
 * Problem ID: 179
 * Difficulty: Medium
 * Language: Java
 * Runtime: 6 ms
 * Memory: 44.6 MB
 * Synced From: LeetCode
 * Date: 2026-08-09
 */

class Solution {
    public String largestNumber(int[] nums) {
         String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder ans = new StringBuilder();

        for (String s : arr) {
            ans.append(s);
        }

        return ans.toString();
    }
}