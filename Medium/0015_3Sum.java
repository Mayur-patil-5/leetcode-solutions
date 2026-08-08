/*
 * Problem: 3Sum
 * Problem ID: 15
 * Difficulty: Medium
 * Language: Java
 * Runtime: 874 ms
 * Memory: 59.9 MB
 * Synced From: LeetCode
 * Date: 2026-08-08
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>> s= new HashSet<>();
        
        for(int i=0;i<n-2;i++){
            int low=i+1;
            int high=n-1;

            while(low<high){
              int sum=nums[i]+nums[low]+nums[high];

              if(sum==0){
                s.add(Arrays.asList(nums[i],nums[low],nums[high]));
                low++;
                high--;
              }else if(sum<0){
                low++;
              }else{
                high--;
              }
            }
        }
        ans.addAll(s);
        return ans;
    }
}