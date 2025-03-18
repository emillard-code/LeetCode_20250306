package com.project.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {

    public static void main(String[] args) {

        int[][] grid1 = { {1, 3}, {2,2} };
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid1)));

        int[][] grid2 = { {9, 1, 7}, {8, 9, 2}, {3,4,6} };
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid2)));

    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int missing = -1, repeat = -1;

        // Store frequency of each number in the grid
        Map<Integer, Integer> freq = new HashMap<>();

        for (int[] row : grid) {

            for (int num : row) {

                freq.put(num, freq.getOrDefault(num, 0) + 1);

            }

        }

        // Check numbers from 1 to n^2 to find missing and repeated values
        for (int num = 1; num <= n * n; num++) {

            if (!freq.containsKey(num)) {
                missing = num; // Number not present in grid
            } else if (freq.get(num) == 2) {
                repeat = num; // Number appears twice
            }

        }

        return new int[] { repeat, missing };

    }

}
