package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {

    private final MissingNumber missingNumber = new MissingNumber();

    @Test
    public void missingNumber() {
        int[] nums = new int[]{3, 0, 1};
        assertEquals(2, missingNumber.missingNumber(nums));

        nums = new int[]{0, 1};
        assertEquals(2, missingNumber.missingNumber(nums));

        nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertEquals(8, missingNumber.missingNumber(nums));
    }
}