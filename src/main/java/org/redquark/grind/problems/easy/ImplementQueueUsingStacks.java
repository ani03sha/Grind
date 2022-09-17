package org.redquark.grind.problems.easy;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    /**
     * Time complexities - Push => O(n), Pop =>  O(1), Peek => O(1), Empty => O(1)
     * Space complexity - O(n)
     */
    static class MyQueueOne {

        // Stack to store the incoming operation, i.e., it will be
        // used during the push operation
        private final Stack<Integer> primary;
        // Stack will be to maintain the FIFO
        private final Stack<Integer> secondary;

        public MyQueueOne() {
            this.primary = new Stack<>();
            this.secondary = new Stack<>();
        }

        public void push(int x) {
            // Moving all elements from primary to the secondary to maintain
            // the FIFO order
            while (!this.primary.isEmpty()) {
                this.secondary.push(this.primary.pop());
            }
            // Push the new element to the stack
            this.primary.push(x);
            // Again move the elements from secondary to primary
            while (!this.secondary.isEmpty()) {
                this.primary.push(this.secondary.pop());
            }
        }

        public int pop() {
            return this.primary.pop();
        }

        public int peek() {
            return this.primary.peek();
        }

        public boolean empty() {
            return this.primary.isEmpty();
        }
    }

    /**
     * Time complexities - Push => O(n), Pop =>  O(1), Peek => O(1), Empty => O(1)
     * Space complexity - O(n)
     */
    static class MyQueueTwo {

        // Stack to store the incoming operation, i.e., it will be
        // used during the push operation
        private final Stack<Integer> primary;
        // Stack will be to maintain the FIFO
        private final Stack<Integer> secondary;

        public MyQueueTwo() {
            this.primary = new Stack<>();
            this.secondary = new Stack<>();
        }

        public void push(int x) {
            this.primary.push(x);
        }

        public int pop() {
            peek();
            return this.secondary.pop();
        }

        public int peek() {
            if (this.secondary.isEmpty()) {
                while (!this.primary.isEmpty()) {
                    this.secondary.push(this.primary.pop());
                }
            }
            return this.secondary.peek();
        }

        public boolean empty() {
            return this.primary.isEmpty() && this.secondary.isEmpty();
        }
    }
}
