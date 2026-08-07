/*
 * Problem: Plus One
 * Problem ID: 66
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43 MB
 * Synced From: LeetCode
 * Date: 2026-08-07
 */

class Solution {
      public int[] plusOne(int[] digits) {

        // Last digit se start karo
        for (int i = digits.length - 1; i >= 0; i--) {

            // Agar digit 9 nahi hai
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }

            // Agar 9 hai to 0 bana do aur carry aage jayega
            digits[i] = 0;
        }

        // Agar saare digits 9 the
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }
}