package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {

    private final ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    public void testClimbStairs() {
        assertEquals(2, climbingStairs.climbStairs(2));
        assertEquals(3, climbingStairs.climbStairs(3));
        assertEquals(1836311903, climbingStairs.climbStairs(45));
    }

    @Test
    public void testClimbStairsSpaceOptimized() {
        assertEquals(2, climbingStairs.climbStairsSpaceOptimized(2));
        assertEquals(3, climbingStairs.climbStairsSpaceOptimized(3));
        assertEquals(1836311903, climbingStairs.climbStairsSpaceOptimized(45));
    }
}