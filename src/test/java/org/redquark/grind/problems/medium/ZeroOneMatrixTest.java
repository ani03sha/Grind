package org.redquark.grind.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ZeroOneMatrixTest {

    private final ZeroOneMatrix zeroOneMatrix = new ZeroOneMatrix();

    @Test
    public void testUpdateMatrixBFS() {
        int[][] mat = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        int[][] expected = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        assertArrayEquals(expected, zeroOneMatrix.updateMatrixBFS(mat));

        mat = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        expected = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 2, 1}
        };
        assertArrayEquals(expected, zeroOneMatrix.updateMatrixBFS(mat));
    }
}