package org.redquark.grind.problems.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpiralMatrixTest {

    private final SpiralMatrix spiralMatrix = new SpiralMatrix();

    @Test
    public void testSpiralOrder() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
        assertEquals(expected, spiralMatrix.spiralOrder(matrix));

        matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        expected = List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        assertEquals(expected, spiralMatrix.spiralOrder(matrix));
    }
}