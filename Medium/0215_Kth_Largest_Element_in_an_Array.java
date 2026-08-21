/*
 * Problem: Kth Largest Element in an Array
 * Problem ID: 215
 * Difficulty: Medium
 * Language: Java
 * Runtime: 69 ms
 * Memory: 74.5 MB
 * Synced From: LeetCode
 * Date: 2026-08-21
 */

import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);

            // Keep only k largest elements
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}