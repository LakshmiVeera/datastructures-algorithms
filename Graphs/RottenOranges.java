package Graphs.Grids;
import java.util.*;

/**
 * In a given grid, each cell can have one of three values:
 *
 * the value 0 representing an empty cell;
 * the value 1 representing a fresh orange;
 * the value 2 representing a rotten orange.
 * Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.
 *
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange.  If this is impossible, return -1 instead.
 */
public class RottenOranges {
    public int getMinutes(int[][] grid){
        int minutes = 0;
        Queue<int[]> queue =  new LinkedList<int[]>();
        int rottenCount = 0;
        int freshCount = 0;
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                    rottenCount++;
                }
                if(grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        while (queue.size() > 0 && freshCount > 0) {
            int n = queue.size();
            for (int i = 0; i< n; i++) {
                int[] rottenOrangePos = queue.poll();
                int[][] directions = new int[][] {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
                for (int[] direction : directions) {
                    int newX = rottenOrangePos[0] + direction[0];
                    int newY = rottenOrangePos[1] + direction[1];
                    if (newX < grid.length && newY < grid[0].length && newX >= 0 && newY >= 0 && grid[newX][newY] == 1) {
                        grid[newX][newY] = 2;
                        rottenCount++;
                        freshCount--;
                        queue.offer(new int[]{newX, newY});
                    }
                }
            }
            minutes++;
        }
        return freshCount == 0 ? minutes : -1;
    }
    public static void main(String... args) {
        int[][] grid = new int[][] {
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        };
        RottenOranges rottenOranges = new RottenOranges();
        System.out.println(rottenOranges.getMinutes(grid));
    }
}
