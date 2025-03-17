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

    // This method finds the missing and repeated values in grid[][].
    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        // First, we will store our missing and repeated values in these variables.
        int missingElement = -1;
        int repeatedElement = -1;

        // We then create a LinkedList that will contain all values between 1 and n^2.
        // We will use int numberOfElements to fill the LinkedList with the appropriate values.
        LinkedList<Integer> listOfElements = new LinkedList();
        int numberOfElements = grid.length * grid[0].length;

        // We then perform a simple loop to fill the LinkedList with the values that we need.
        for (int i = 1; i <= numberOfElements; i++) {

            listOfElements.add(i);

        }

        // Then, we will loop through each value in the 2D array grid[][],
        // and we sequentially remove these values from LinkedList listOfElements.
        // Eventually, there should be a point where the loops will try to remove an
        // element that has already been removed from LinkedList listOfElements. This
        // value is the repeated value. In addition, once the loops are complete, there
        // should be a single element left in LinkedList listOfElements that wasn't removed
        // because that element didn't exist in grid[][]. This is the missing element.
        for (int i = 0; i < grid.length; i++) {

            for (int k = 0; k < grid.length; k++) {

                if (!listOfElements.contains(grid[i][k])) {
                    repeatedElement = grid[i][k];
                }

                listOfElements.removeFirstOccurrence(grid[i][k]);

            }

        }

        missingElement = listOfElements.get(0);

        // Now that we have both our repeated and missing element, we simply return
        // them as an int array as per challenge specifications.
        return new int[]{ repeatedElement, missingElement };

    }

}
