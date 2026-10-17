/*
 * Problem: Minimum Swaps to Sort by Digit Sum
 * Problem ID: 3847
 * Difficulty: Medium
 * Language: Java
 * Runtime: 250 ms
 * Memory: 119.4 MB
 * Synced From: LeetCode
 * Date: 2026-10-17
 */

class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++){
            int num=nums[i];
            int sum=0;
            while(num>0){
                int digit=num%10;
                sum+=digit;
                num=num/10;
            }
            arr[i][0]=sum;
            arr[i][1]=nums[i];
            arr[i][2]=i;
        }
        Arrays.sort(arr,(a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            return a[1]-b[1];
        });
        int swaps=0;
        for(int i=0;i<n;i++){
            while(arr[i][2]!=i){
                int correctidx=arr[i][2];
                int temp[]=arr[i];
                arr[i]=arr[correctidx];
                arr[correctidx]=temp;
                swaps++;
            }
        }
        return swaps;
    }
}