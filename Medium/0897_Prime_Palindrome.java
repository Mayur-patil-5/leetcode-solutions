/*
 * Problem: Prime Palindrome
 * Problem ID: 897
 * Difficulty: Medium
 * Language: Java
 * Runtime: 48 ms
 * Memory: 46.2 MB
 * Synced From: LeetCode
 * Date: 2026-10-07
 */

// class Solution {
//     public int primePalindrome(int n) {
//         while(true){
//             if(isPalindrome(n) && isPrime(n)) {
//                 return n;
//             }
//             n++;
//              // Skip even numbers
//             if(n>2 && n%2==0) {   //why to avoid unnessarry checks for TLE
//                 n++;
//             }
//         }
//     }
//     // Check prime
//     public boolean isPrime(int n) {
//         if (n<2) {
//             return false;
//         }
//         for(int i=2;i*i<=n;i++) {
//             if(n%i==0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//      // Check palindrome
//     public boolean isPalindrome(int n) {
//         int original = n;
//         int reverse = 0;
//         while (n>0) {
//             int digit=n%10;
//             reverse=reverse*10+digit;
//             n=n/10;
//         }
//         return original==reverse;
//     }
// }


//optimized code for it
class Solution {
    public int primePalindrome(int n) {

        // 1 digit and 2 digit cases
        if (n <= 11) {
            for (int i = n; i <= 11; i++) {
                if (isPrime(i) && isPalindrome(i)) {
                    return i;
                }
            }
        }

        // Generate odd-length palindromes
        for (int i = 1; i <= 100000; i++) {

            String s = String.valueOf(i);

            String reverse = new StringBuilder(s).reverse().toString();

            // Remove last digit from reverse
            // so palindrome has odd length
            String palindrome = s + reverse.substring(1);

            int num = Integer.parseInt(palindrome);

            if (num >= n && isPrime(num)) {
                return num;
            }
        }

        return -1;
    }

    public boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome(int n) {

        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return original == reverse;
    }
}
