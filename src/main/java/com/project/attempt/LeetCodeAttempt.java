package com.project.attempt;

import java.util.Arrays;
import java.util.LinkedList;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[][] grid1 = { {1, 3}, {2,2} };
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid1)));

        int[][] grid2 = { {9, 1, 7}, {8, 9, 2}, {3,4,6} };
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid2)));

    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        int numberOfElements = grid.length * grid[0].length;
        LinkedList<Integer> listOfElements = new LinkedList();

        int missingElement = -1;
        int repeatedElement = -1;

        for (int i = 1; i <= numberOfElements; i++) {

            listOfElements.add(i);

        }

        for (int i = 0; i < grid.length; i++) {

            for (int k = 0; k < grid.length; k++) {

                if (!listOfElements.contains(grid[i][k])) {
                    repeatedElement = grid[i][k];
                }

                listOfElements.removeFirstOccurrence(grid[i][k]);

            }

        }

        missingElement = listOfElements.get(0);

        return new int[]{ repeatedElement, missingElement };

    }

}
