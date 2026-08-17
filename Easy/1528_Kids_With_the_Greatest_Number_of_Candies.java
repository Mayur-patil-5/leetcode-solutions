/*
 * Problem: Kids With the Greatest Number of Candies
 * Problem ID: 1528
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 44 MB
 * Synced From: LeetCode
 * Date: 2026-08-17
 */

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ls = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max){
                ls.add(true);
            }
            else{
                ls.add(false);
            }
        }
        return ls;
    }
}