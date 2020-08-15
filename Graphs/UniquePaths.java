package com.lakshmi.java;

public class UniquePaths {

    public static void main(String... args) {
        System.out.println(uniquePaths(3, 2));
    }

        public static int uniquePaths(int m, int n) {
            int[][] grid = new int[m][n];
            for (int r = 0; r < m; r++) {
                for (int c = 0; c < n; c++) {
                    grid[r][c] = 1;
                }
            }
            for (int r = 1; r < m; r++) {
                for (int c = 1; c < n; c++) {
                    grid[r][c] = grid[r-1][c] + grid[r] [c-1];
                }
            }
            return grid[m-1][n-1];
        }
}
