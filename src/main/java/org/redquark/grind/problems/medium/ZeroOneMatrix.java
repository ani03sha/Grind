package org.redquark.grind.problems.medium;

import java.util.ArrayDeque;
import java.util.Queue;

public class ZeroOneMatrix {

    /**
     * Time complexity - O(mn)
     * Space complexity - O(mn)
     */
    public int[][] updateMatrixBFS(int[][] mat) {
        // Special case
        if (mat == null || mat.length == 0) {
            return mat;
        }
        // Dimensions of the matrix
        int m = mat.length;
        int n = mat[0].length;
        // Queue for BFS
        Queue<int[]> cells = new ArrayDeque<>();
        // Loop through all the cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Store the position of zero cell
                if (mat[i][j] == 0) {
                    cells.offer(new int[]{i, j});
                }
                // Mark all non-zero cell with -1
                else {
                    mat[i][j] = -1;
                }
            }
        }
        // Four directions to move in
        int[] directions = new int[]{0, 1, 0, -1, 0};
        // Loop until the queue is empty
        while (!cells.isEmpty()) {
            int[] cell = cells.remove();
            // Current rows and columns
            int row = cell[0];
            int column = cell[1];
            // Check in all four directions
            for (int i = 0; i < 4; i++) {
                // New row and new column
                int newRow = row + directions[i];
                int newColumn = column + directions[i + 1];
                // Check for out of bounds conditions
                if (newRow < 0 || newRow >= m || newColumn < 0 || newColumn >= n || mat[newRow][newColumn] != -1) {
                    continue;
                }
                mat[newRow][newColumn] = mat[row][column] + 1;
                cells.offer(new int[]{newRow, newColumn});
            }
        }
        return mat;
    }
}
