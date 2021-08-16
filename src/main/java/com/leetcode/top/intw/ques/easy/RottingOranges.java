/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author AD79272
 *
 */
public class RottingOranges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RottingOranges main = new RottingOranges();

		int[][] grid = new int[][] { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		int time = main.orangesRotting(grid);
		System.out.println("main\t" + time);
		
		grid = new int[][] { {2,1,1},{0,1,1},{1,0,1} };
		time = main.orangesRotting(grid);
		System.out.println("main\t" + time);
		
		grid = new int[][] { {0,2} };
		time = main.orangesRotting(grid);
		System.out.println("main\t" + time);
	}

	public int orangesRotting(int[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}

		int rows = grid.length;
		int columns = grid[0].length;

		Queue<int[][]> q = new ArrayDeque<>();
		int clean_count = 0;
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < columns; c++) {
				if (grid[r][c] == 2) // rotten apples
				{
					q.offer(new int[][] { { r }, { c } });
				} else if (grid[r][c] == 1) // clean apples
				{
					clean_count++;
				}
			}
		}

		if (clean_count == 0) {
			// no clean apples; return 0
			return 0;
		}

		int mins = 0;
		int dir[][] = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
		while (!q.isEmpty()) {
			mins++;
			int size = q.size();
			for (int j = 0; j < size; j++) {
				int[][] point = q.poll();
				for (int i = 0; i < dir.length; i++) {
					int r = point[0][0] + dir[i][0];
					int c = point[1][0] + dir[i][1];

					if (r < 0 || c < 0 || r >= rows || c >= columns || grid[r][c] == 2 || grid[r][c] == 0) {
						continue;
					}

					grid[r][c] = 2;
					q.offer(new int[][] { { r }, { c } });
					
					// decrease the count of fresh oranges by 1
					clean_count--;
				}
			}
		}
		
		return clean_count == 0 ? mins - 1 : -1;
	}
}
