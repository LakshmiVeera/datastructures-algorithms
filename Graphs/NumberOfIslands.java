package Graphs;
/*
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 */
public class NumberOfIslands {
    public static void main(String... args) {
        int[][] input = new int[][] { {1, 0 , 0, 0}, {0, 0, 1, 1}, {1, 0, 0, 1}};
        System.out.println(noOfIslands_DFS(input));
    }

    public static int noOfIslands_DFS(int[][] input) {
        int noOfIslands = 0;

        int nr = input.length;
        int nc = input[0].length;

        for (int i = 0; i < nr; ++i) {
            for (int j = 0; j < nc; ++j) {
                if (input[i][j] == 1) {
                    ++noOfIslands;
                    DFS(input, i, j);
                }
            }
        }
        return noOfIslands;
    }
    public static void DFS(int[][] grid, int r, int c) {
        if (grid ==  null || grid.length == 0 || r < 0 || c <0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) {
            return;
        }
        grid[r][c] = 0;
        DFS(grid, r-1, c);
        DFS(grid, r+1, c);
        DFS(grid, r, c+1);
        DFS(grid, r, c-1);
    }
}
