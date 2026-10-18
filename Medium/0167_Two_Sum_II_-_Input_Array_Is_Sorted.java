/*
 * Problem: Two Sum II - Input Array Is Sorted
 * Problem ID: 167
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms
 * Memory: 47.8 MB
 * Synced From: LeetCode
 * Date: 2026-10-18
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left=0 , right=n-1;
        ArrayList<Integer> list=new ArrayList<>();
        int[] res=new int[2];
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                list.add(left+1);
                list.add(right+1);
                res[0]=list.get(0);
                res[1]=list.get(1);
                return res;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}