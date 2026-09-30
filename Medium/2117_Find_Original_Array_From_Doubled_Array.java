/*
 * Problem: Find Original Array From Doubled Array
 * Problem ID: 2117
 * Difficulty: Medium
 * Language: Java
 * Runtime: 113 ms
 * Memory: 138.6 MB
 * Synced From: LeetCode
 * Date: 2026-09-30
 */

class Solution {
    public int[] findOriginalArray(int[] changed) {

        if (changed.length % 2 != 0) {
            return new int[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : changed) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(changed);

        int[] original = new int[changed.length / 2];
        int index = 0;

        for (int num : changed) {

            if (map.getOrDefault(num, 0) == 0) {
                continue;
            }

            // Special case for 0
            if (num == 0) {

                if (map.get(0) < 2) {
                    return new int[0];
                }

                original[index] = 0;
                index++;

                map.put(0, map.get(0) - 2);

                continue;
            }

            int twice = num * 2;

            if (map.getOrDefault(twice, 0) == 0) {
                return new int[0];
            }

            original[index] = num;
            index++;

            map.put(num, map.get(num) - 1);
            map.put(twice, map.get(twice) - 1);
        }

        return original;
    }
}