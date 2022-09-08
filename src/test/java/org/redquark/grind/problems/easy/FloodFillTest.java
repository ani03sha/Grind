package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FloodFillTest {

    private final FloodFill floodFill = new FloodFill();

    @Test
    public void testFloodFillDFS() {
        int[][] image = new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int color = 2;
        int[][] expected = new int[][]{
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        };
        assertArrayEquals(expected, floodFill.floodFillDFS(image, sr, sc, color));

        image = new int[][]{
                {0, 0, 0},
                {0, 0, 0}
        };
        sr = 0;
        sc = 0;
        color = 0;
        expected = new int[][]{
                {0, 0, 0},
                {0, 0, 0}
        };
        assertArrayEquals(expected, floodFill.floodFillDFS(image, sr, sc, color));
    }

    @Test
    public void testFloodFillBFS() {
        int[][] image = new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int color = 2;
        int[][] expected = new int[][]{
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        };
        assertArrayEquals(expected, floodFill.floodFillBFS(image, sr, sc, color));

        image = new int[][]{
                {0, 0, 0},
                {0, 0, 0}
        };
        sr = 0;
        sc = 0;
        color = 0;
        expected = new int[][]{
                {0, 0, 0},
                {0, 0, 0}
        };
        assertArrayEquals(expected, floodFill.floodFillBFS(image, sr, sc, color));
    }
}