package org.redquark.grind.problems.easy;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {

    /**
     * Time complexity - O(mn)
     * Space complexity - O(mn)
     */
    public int[][] floodFillDFS(int[][] image, int sr, int sc, int newColor) {
        // Special case
        if (image == null || image.length == 0 || image[sr][sc] == newColor) {
            return image;
        }
        // Perform DFS to fill the color
        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int previousColor, int newColor) {
        // Check for the out-of-bounds indices
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != previousColor) {
            return;
        }
        // Color the starting cell with the newColor
        image[sr][sc] = newColor;
        // Now recurse for every neighbor
        dfs(image, sr - 1, sc, previousColor, newColor);
        dfs(image, sr + 1, sc, previousColor, newColor);
        dfs(image, sr, sc - 1, previousColor, newColor);
        dfs(image, sr, sc + 1, previousColor, newColor);
    }

    public int[][] floodFillBFS(int[][] image, int sr, int sc, int newColor) {
        // Special case
        if (image == null || image.length == 0 || image[sr][sc] == newColor) {
            return image;
        }
        // Directions array
        int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        // Queue to store all the visited cells for BFS
        Queue<int[]> cells = new LinkedList<>();
        // Add the starting cell to the queue
        cells.offer(new int[]{sr, sc});
        // Store the current color of starting cell
        int previousColor = image[sr][sc];
        // Color the starting cell
        image[sr][sc] = newColor;
        // Loop until the queue is empty
        while (!cells.isEmpty()) {
            // Get the front of the queue
            int[] cell = cells.poll();
            // Move in all directions
            for (int[] direction : directions) {
                int newRow = cell[0] + direction[0];
                int newColumn = cell[1] + direction[1];
                // Check if the newRow and newColumn are not out of bounds
                if (newRow < 0 || newRow >= image.length || newColumn < 0 || newColumn >= image[0].length || image[newRow][newColumn] != previousColor) {
                    continue;
                }
                // Color the new cell
                image[newRow][newColumn] = newColor;
                // Add the new cell to the queue
                cells.offer(new int[]{newRow, newColumn});
            }
        }
        return image;
    }
}
