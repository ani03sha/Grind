package org.redquark.grind.problems.easy;

public class NumberOf1Bits {

    /**
     * Time complexity - O(1), as there are only 32 bits
     * Space complexity - (1)
     */
    public int hammingWeight(int n) {
        // Count of set bits
        int setBits = 0;
        // Loop until the value of n becomes 0
        while (n != 0) {
            n &= (n - 1);
            setBits++;
        }
        return setBits;
    }
}
