package org.redquark.grind.problems.medium;

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        // Special case
        if (coins == null || coins.length == 0 || amount <= 0) {
            return 0;
        }
        // Lookup table to store the minimum number of coins
        // to make a certain amount
        int[] lookup = new int[amount + 1];
        // Fill the array with default value
        Arrays.fill(lookup, Integer.MAX_VALUE);
        // Since we don't require any coin for amount = 0
        lookup[0] = 0;
        // Populate the table for remaining amounts
        for (int i = 1; i <= amount; i++) {
            // Check for every coin that if it can be used to make
            // the current amount or not
            for (int coin : coins) {
                // We can only use the current coin, only if it is
                // less than the current amount
                if (coin <= i) {
                    // Find the differential number
                    int difference = lookup[i - coin];
                    // If we have calculated this difference before
                    if (difference != Integer.MAX_VALUE) {
                        lookup[i] = Math.min(lookup[i], difference + 1);
                    }
                }
            }
        }
        return lookup[amount] == Integer.MAX_VALUE ? -1 : lookup[amount];
    }
}
