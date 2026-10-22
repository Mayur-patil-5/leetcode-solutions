/*
 * Problem: Closest Prime Numbers in Range
 * Problem ID: 2610
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1091 ms
 * Memory: 41.9 MB
 * Synced From: LeetCode
 * Date: 2026-10-22
 */

class Solution {
    public boolean isPrime(int n) {
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int prevPrime = -1;
        int minDiff = Integer.MAX_VALUE;
        int[] ans = {-1, -1};
        for (int i=left;i<=right;i++){
            if(isPrime(i)){
                if (prevPrime !=-1){
                    int diff=i-prevPrime;
                    if(diff<minDiff){
                        minDiff=diff;
                        ans[0]=prevPrime;
                        ans[1]=i;
                    }
                }
                prevPrime=i;
            }
        }
        return ans;
    }
}