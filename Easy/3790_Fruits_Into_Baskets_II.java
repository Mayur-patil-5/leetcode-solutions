/*
 * Problem: Fruits Into Baskets II
 * Problem ID: 3790
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms
 * Memory: 46.7 MB
 * Synced From: LeetCode
 * Date: 2026-09-26
 */

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int i=0;
        int res=0;
        int n=fruits.length; 
        while(i<n){
           int j=0;
            while(j<baskets.length){               
                if(baskets[j] != -1  && fruits[i] <= baskets[j]){
                    baskets[j] = -1 ; 
                    res++;
                    break;
                }
                j++;
            }
            i++;
        }
        return n-res;
    }
}
