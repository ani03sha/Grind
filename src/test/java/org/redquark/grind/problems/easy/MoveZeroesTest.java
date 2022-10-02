package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroesTest {

    private final MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    public void testMoveZeroes() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        int[] expected = new int[]{1, 3, 12, 0, 0};
        assertArrayEquals(expected, moveZeroes.moveZeroes(nums));

        nums = new int[]{0};
        expected = new int[]{0};
        assertArrayEquals(expected, moveZeroes.moveZeroes(nums));
    }
}