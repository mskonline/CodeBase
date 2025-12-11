package compete.leetcode.graphs;

public class SwimInRisingWater {
    public static int swimInWater(int[][] grid) {
        int rows = grid.length;
        int minimumTime = 0;
        int t = 0;

        if (rows == 0) {
            return minimumTime;
        }

        int cols = grid[0].length;
        int[][] visited = new int[rows][cols];
        visited[0][0] = 1;

        minimumTime = dfs(grid, 0, 0, grid[0][0], visited);

        return minimumTime;
    }


    public static int dfs(int[][] grid, int r, int c, int t, int[][] visited) {
        if (r == grid.length -1 && c == grid[0].length - 1) {
            return t;
        }

        // left, top, bottom and right
        int[] dirR = {0, -1, 0, 1};
        int[] dirC = {-1, 0, 1, 0};
        int notFound = 0;
        int computedT = 0;

        while (true) {
            for (int i = 0; i < dirR.length; ++i) {
                int newR = r + dirR[i];
                int newC = c + dirC[i];

                if (newR >= 0 && newR < grid.length && newC >= 0 && newC < grid[0].length && visited[newR][newC] != 1 && grid[newR][newC] <= t) {
                    visited[newR][newC] = 1;
                    computedT = dfs(grid, newR, newC, t, visited);
                    notFound = 0;
                    break;
                } else {
                    ++notFound;
                }

                if(newR >= 0 && newR < grid.length && newC >= 0 && newC < grid[0].length)
                System.out.println("grid[newR][newC]: " + grid[newR][newC]);
            }
            System.out.println("t:" + t + " r:" + r + " c:" + c);

            if (notFound == 4) {
                t += 1;
                notFound = 0;
            } else {
                break;
            }
        }

        return Math.max(t, computedT);
    }

    public static void main(String[] args) {
        int[][] grid = {{10,12,4,6}, {9,11,3,5}, {1,7,13,8}, {2,0,15,14}};
        //int[][] grid = {{0,2}, {1,3}};
        //int[][] grid = {{0,1,2,3,4},{24,23,22,21,5},{12,13,14,15,16},{11,17,18,19,20},{10,9,8,7,6}};
        System.out.println(swimInWater(grid));
    }
}
