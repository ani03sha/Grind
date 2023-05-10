package org.redquark.grind.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniquePathsTest {

    private final UniquePaths uniquePaths = new UniquePaths();

    @Test
    public void testUniquePaths() {
        int m = 3;
        int n = 7;
        assertEquals(28, uniquePaths.uniquePaths(m, n));

        m = 4;
        n = 2;
        assertEquals(4, uniquePaths.uniquePaths(m, n));
    }
}