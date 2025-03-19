package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void findMissingAndRepeatedValuesTest() {

        int[][] grid1 = { {1, 3}, {2,2} };
        assertArrayEquals(new int[]{ 2 , 4 }, LeetCodeAttempt.findMissingAndRepeatedValues(grid1));

        int[][] grid2 = { {9, 1, 7}, {8, 9, 2}, {3,4,6} };
        assertArrayEquals(new int[]{ 9 , 5 }, LeetCodeAttempt.findMissingAndRepeatedValues(grid2));

    }

}
