package org.redquark.grind.problems.medium;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottingOranges {

    public int orangesRotting(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Dimensions of the matrix
        int m = grid.length;
        int n = grid[0].length;
        // Queue to store all the rotten oranges
        final Queue<int[]> rottens = new ArrayDeque<>();
        // Array to mark visited cells
        final boolean[][] visited = new boolean[m][n];
        // Number of fresh oranges
        int freshOranges = 0;
        // Traverse through the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    freshOranges++;
                } else if (grid[i][j] == 2) {
                    rottens.offer(new int[]{i, j});
                }
            }
        }
        // Total number of minutes taken to get all oranges rotten
        int minutes = 0;
        // Directions array
        final int[][] directions = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        // Traverse until all the rotten oranges are traversed
        while (!rottens.isEmpty()) {
            // Get the size of the queue
            int currentRottenOranges = rottens.size();
            // Traverse for all rotten oranges
            for (int i = 0; i < currentRottenOranges; i++) {
                // Get the cell with rotten orange
                int[] rottenCell = rottens.remove();
                // Traverse in all four directions to this cell
                for (int[] direction : directions) {
                    int x = rottenCell[0] + direction[0];
                    int y = rottenCell[1] + direction[1];
                    // Check for the validity of this cell
                    if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] != 1 || visited[x][y]) {
                        continue;
                    }
                    // Mark the orange as rotten
                    grid[x][y] = 2;
                    // Mark this cell as visited
                    visited[x][y] = true;
                    // Add the cell to the rottens queue
                    rottens.offer(new int[]{x, y});
                    // Since one orange has become rotten, we would decrement the count
                    // of one fresh orange
                    freshOranges--;
                }
            }
            // If we still have some rotten oranges, we need to increment minutes
            if (!rottens.isEmpty()) {
                minutes++;
            }
        }
        return freshOranges == 0 ? minutes : -1;
    }
}
