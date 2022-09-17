package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.redquark.grind.problems.easy.ImplementQueueUsingStacks.MyQueueOne;
import static org.redquark.grind.problems.easy.ImplementQueueUsingStacks.MyQueueTwo;

public class ImplementQueueUsingStacksTest {

    private final MyQueueOne myQueueOne = new MyQueueOne();
    private final MyQueueTwo myQueueTwo = new MyQueueTwo();

    @Test
    public void testMyQueueOne() {
        myQueueOne.push(1);
        myQueueOne.push(2);
        assertEquals(1, myQueueOne.peek());
        assertEquals(1, myQueueOne.pop());
        assertFalse(myQueueOne.empty());
    }

    @Test
    public void testMyQueueTwo() {
        myQueueTwo.push(1);
        myQueueTwo.push(2);
        assertEquals(1, myQueueTwo.peek());
        assertEquals(1, myQueueTwo.pop());
        assertFalse(myQueueTwo.empty());
    }
}