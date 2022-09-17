package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstBadVersionTest {

    private final FirstBadVersion firstBadVersion = new FirstBadVersion();

    @Test
    public void testFirstBadVersionSolutionOne() {
        assertEquals(4, firstBadVersion.firstBadVersionSolutionOne(5));
    }

    @Test
    public void testFirstBadVersionSolutionTwo() {
        assertEquals(4, firstBadVersion.firstBadVersionSolutionTwo(5));
    }
}