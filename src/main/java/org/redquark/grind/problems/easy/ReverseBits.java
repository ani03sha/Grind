package org.redquark.grind.problems.easy;

public class ReverseBits {

    /**
     * Time complexity - O(32) ~ O(1)
     * Space complexity - O(1)
     */
    public int reverseBits(int n) {
        // Special case
        if (n == 0) {
            return 0;
        }
        // Variable to store the reversed bits
        int reversed = 0;
        // Loop for all 32 bits
        for (int i = 0; i < 32; i++) {
            // Left shift the reversed by 1
            reversed <<= 1;
            // Check if the LSB of the input is 1
            if ((n & 1) == 1) {
                reversed++;
            }
            // We have taken care of the LSB in n,
            // so we will drop it
            n >>= 1;
        }
        return reversed;
    }
}
