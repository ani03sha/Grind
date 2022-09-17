package org.redquark.grind.problems.easy;

public class ClimbingStairs {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public int climbStairs(int n) {
        // Special case
        if (n <= 0) {
            throw new IllegalArgumentException("Number of stairs should be greater than 0.");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        // Array to store the ways to climb the stairs
        int[] lookup = new int[n + 1];
        // Base initialization
        lookup[1] = 1;
        lookup[2] = 2;
        // Populate the table for the remaining stairs
        for (int i = 3; i <= n; i++) {
            lookup[i] = lookup[i - 1] + lookup[i - 2];
        }
        return lookup[n];
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public int climbStairsSpaceOptimized(int n) {
        // Special case
        if (n <= 0) {
            throw new IllegalArgumentException("Number of stairs should be greater than 0.");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        int a = 1;
        int b = 2;
        int c = 0;
        // Loop for remaining stairs
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
