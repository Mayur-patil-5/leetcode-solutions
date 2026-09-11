/*
 * Problem: Unique 3-Digit Even Numbers
 * Problem ID: 3799
 * Difficulty: Easy
 * Language: Java
 * Runtime: 5 ms
 * Memory: 46.4 MB
 * Synced From: LeetCode
 * Date: 2026-09-11
 */

class Solution {
    public int totalNumbers(int[] digits) {
       int n=digits.length;
       Set<Integer> set = new HashSet<>();
       for(int i=0;i<n;i++){
        if(digits[i]==0) continue;
        for(int j=0;j<n;j++){
            if(i==j) continue;
            for(int k=0;k<n;k++){
                if(k==i || k==j) continue;
                if(digits[k]%2==0){
                    int num=digits[i]*100+digits[j]*10+digits[k];
                    set.add(num);
                }
            }

        }
       }
       return set.size();
    }
}