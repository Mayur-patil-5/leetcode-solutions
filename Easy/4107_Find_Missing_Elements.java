/*
 * Problem: Find Missing Elements
 * Problem ID: 4107
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms
 * Memory: 46.1 MB
 * Synced From: LeetCode
 * Date: 2026-08-04
 */

import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}