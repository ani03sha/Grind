package org.redquark.grind.problems.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumTest {

    private final ThreeSum threeSum = new ThreeSum();

    @Test
    public void testThreeSum() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));
        assertEquals(expected, threeSum.threeSum(nums));

        nums = new int[]{0, 1, 1};
        expected = Collections.emptyList();
        assertEquals(expected, threeSum.threeSum(nums));

        nums = new int[]{0, 0, 0};
        expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0, 0));
        assertEquals(expected, threeSum.threeSum(nums));
    }
}