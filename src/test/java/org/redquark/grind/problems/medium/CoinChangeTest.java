package org.redquark.grind.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeTest {

    private final CoinChange coinChange = new CoinChange();

    @Test
    public void testCoinChange() {
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        assertEquals(3, coinChange.coinChange(coins, amount));

        coins = new int[]{2};
        amount = 3;
        assertEquals(-1, coinChange.coinChange(coins, amount));

        coins = new int[]{1};
        amount = 0;
        assertEquals(0, coinChange.coinChange(coins, amount));
    }
}