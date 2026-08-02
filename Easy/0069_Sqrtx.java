/*
 * Problem: Sqrt(x)
 * Problem ID: 69
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 42.6 MB
 * Synced From: LeetCode
 * Date: 2026-08-02
 */

class Solution{
    public int mySqrt(int x) {
    if (x == 0) {
        return 0;
    }
    int left = 1;
    int right = x;

    int result=1;

    while (left<= right) {
        int mid =left + (right - left) / 2;
        long val = (long) mid * mid;

        if (val == x) {
            return mid;
        } else if (val < x) {
            result=mid;
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
 return result;
}
}