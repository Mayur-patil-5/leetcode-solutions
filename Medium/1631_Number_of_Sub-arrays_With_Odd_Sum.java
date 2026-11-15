/*
 * Problem: Number of Sub-arrays With Odd Sum
 * Problem ID: 1631
 * Difficulty: Medium
 * Language: Java
 * Runtime: 7 ms
 * Memory: 81.4 MB
 * Synced From: LeetCode
 * Date: 2026-11-15
 */

class Solution {
    public int numOfSubarrays(int[] arr) {
        int count = 0;
        int even = 1;
        int odd = 0;
        int sum = 0;
        int mod = 1000000007;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum % 2 != 0) {
                count = (count + even) % mod;
                odd++;
            }
            else {
                count = (count + odd) % mod;
                even++;
            }
        }

        return count;
    }
}