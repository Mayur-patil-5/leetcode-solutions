/*
 * Problem: Maximize Sum of Squares of Digits
 * Problem ID: 4084
 * Difficulty: Medium
 * Language: Java
 * Runtime: 94 ms
 * Memory: 47.8 MB
 * Synced From: LeetCode
 * Date: 2026-10-14
 */


class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (num * 9 < sum) {
            return "";
        }
        StringBuilder ans = new StringBuilder();
        while (sum > 0 && ans.length() < num) {
            int digit = Math.min(9, sum);
            ans.append(digit);
            sum -= digit;
        }
        while (ans.length() < num) {
            ans.append('0');
        }
        return ans.toString();
    }
}


//revisit on 15 october 