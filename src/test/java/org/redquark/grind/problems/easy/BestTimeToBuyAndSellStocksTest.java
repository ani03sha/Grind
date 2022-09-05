package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStocksTest {

    private final BestTimeToBuyAndSellStocks bestTimeToBuyAndSellStocks = new BestTimeToBuyAndSellStocks();

    @Test
    public void testMaxProfitBruteForce() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        assertEquals(5, bestTimeToBuyAndSellStocks.maxProfitBruteForce(prices));

        prices = new int[]{7, 6, 4, 3, 1};
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfitBruteForce(prices));
    }

    @Test
    public void testMaxProfitOptimal() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        assertEquals(5, bestTimeToBuyAndSellStocks.maxProfitOptimal(prices));

        prices = new int[]{7, 6, 4, 3, 1};
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfitOptimal(prices));
    }
}