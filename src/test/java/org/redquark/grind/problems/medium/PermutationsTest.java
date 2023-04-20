package org.redquark.grind.problems.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermutationsTest {

    private final Permutations permutations = new Permutations();

    @Test
    public void testPermute() {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1, 2, 3));
        expected.add(List.of(1, 3, 2));
        expected.add(List.of(2, 1, 3));
        expected.add(List.of(2, 3, 1));
        expected.add(List.of(3, 1, 2));
        expected.add(List.of(3, 2, 1));
        assertEquals(expected, permutations.permute(nums));

        nums = new int[]{0, 1};
        expected = new ArrayList<>();
        expected.add(List.of(0, 1));
        expected.add(List.of(1, 0));
        assertEquals(expected, permutations.permute(nums));

        nums = new int[]{1};
        expected = new ArrayList<>();
        expected.add(Collections.singletonList(1));
        assertEquals(expected, permutations.permute(nums));
    }
}