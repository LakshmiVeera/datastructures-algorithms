package Arrays;
/*
    Rotate the n x n 2D Matrix by 90 degrees without taking an additional space
 */
public class Rotate2DArray {
    public int[][] rotate2D(int[][] grid) {

        // transpose the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = i; j < grid[i].length; j++) {
                int temp = grid[i][j];
                grid[i][j] = grid[j][i];
                grid[j][i] = temp;
            }

        }
        // print the grid transpose
        for (int i = 0; i < grid.length; i++) {
            System.out.println();
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "  ");
            }
        }

        System.out.println("********************************");

        // reverse the grid
        for (int i = 0; i < grid.length; i++) {
            int k = grid[i].length-1;
            for (int j = 0; j < grid[i].length/2; j++, k--) {
                int temp = grid[i][j];
                grid[i][j] = grid[i][k];
                grid[i][k] = temp;
            }
        }
        return grid;
    }
    public static void main(String[] args) {
        int[][] grid1 = new int[][] { { 1, 2, 3},
                                    { 4, 5, 6 },
                                    { 7, 8, 9 } };

        int[][] grid = new int[][] { { 1, 2, 3, 4},
                                    { 5, 6, 7, 8 },
                                    { 9, 10, 11, 12 },
                                    { 13, 14, 15, 16 }};

        for (int i = 0; i < grid.length; i++) {
            System.out.println();
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "  ");
            }
        }

        System.out.println("********************************");

        Rotate2DArray rotateArray = new Rotate2DArray();
        rotateArray.rotate2D(grid);

        for (int i = 0; i < grid.length; i++) {
            System.out.println();
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "  ");
            }
        }
    }
}
