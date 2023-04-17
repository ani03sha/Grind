package org.redquark.grind.problems.medium;

import java.util.ArrayDeque;
import java.util.Queue;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Dimensions of the grid
        int m = grid.length;
        int n = grid[0].length;
        // Number of islands
        int islands = 0;
        // Queue to store the cells
        Queue<int[]> cells = new ArrayDeque<>();
        // Array to store the visited cells
        boolean[][] visited = new boolean[m][n];
        // Array to represent directions
        int[][] directions = new int[][]{
                {0, 1},
                {0, -1},
                {1, 0},
                {-1, 0}
        };
        // Process each cell of the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    // Mark current cells as visited
                    visited[i][j] = true;
                    // Add current cell to the queue
                    cells.offer(new int[]{i, j});
                    // Perform BFS from this cell
                    bfs(grid, m, n, visited, cells, directions);
                    // Update island count
                    islands++;
                }
            }
        }
        return islands;
    }

    private void bfs(char[][] grid, int m, int n, boolean[][] visited, Queue<int[]> cells, int[][] directions) {
        while (!cells.isEmpty()) {
            int[] cell = cells.remove();
            for (int[] direction : directions) {
                int x = cell[0] + direction[0];
                int y = cell[1] + direction[1];
                if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y] || grid[x][y] == '0') {
                    continue;
                }
                cells.offer(new int[]{x, y});
                visited[x][y] = true;
            }
        }
    }
}
