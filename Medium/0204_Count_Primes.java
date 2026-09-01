/*
 * Problem: Count Primes
 * Problem ID: 204
 * Difficulty: Medium
 * Language: Java
 * Runtime: 797 ms
 * Memory: 79.8 MB
 * Synced From: LeetCode
 * Date: 2026-09-01
 */

//Note-Sieve of Eratosthenes approach
//2 to n-1 tk numbers track kro if i=2 tho 2 ke sb multiples remove kr do 
//next i=3 3 ke sb multiple remove and then jo bacha wo prime number.

class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}