package problems.grids;


import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    /*
     * Problem: https://www.geeksforgeeks.org/dsa/flood-fill-algorithm/
     *
     * BFS on a grid
     */

    public static int[][] floodFill(int[][] grid, int sr, int sc, int newColor) {
        if (grid[sr][sc] == newColor)
            return grid;

        int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc});

        int oldColor = grid[sr][sc];
        grid[sr][sc] = newColor;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int[] dir : dirs) {
                int newX = cur[0] + dir[0];
                int newY = cur[1] + dir[1];

                if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && grid[newX][newY] == oldColor) {
                    grid[newX][newY] = newColor;
                    queue.offer(new int[]{newX, newY});
                }
            }
        }

        return grid;
    }

    public static void main(String[] args) {

    }
}
