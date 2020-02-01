/**
 * 
 */
package com.leetcode.top.intw.ques.medium;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * https://leetcode.com/discuss/interview-question/411357/
 * 
 * Answer incorrect
 */
public class ZombieMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ZombieMatrix main = new ZombieMatrix();

		int[][] grid = new int[][] 
			{
			 {0, 1, 1, 0, 1},
			 {0, 1, 0, 1, 0},
			 {0, 0, 0, 0, 1},
			 {0, 1, 0, 0, 0}
			};
		int minHours = main.minHours(grid);
		System.out.println("main\t" + minHours);
	}

	public int minHours(int[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;

		int humans = 0;
		Queue<int[]> q = new ArrayDeque<int[]>();
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				if (grid[r][c] == 1) {
					q.offer(new int[] { r, c });
				} else if (grid[r][c] == 0) {
					humans++;
				}
			}
		}

		if (humans == 0) {
			return 0;
		}

		int hours = 0;
		int dirs[][] = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
		while (!q.isEmpty()) {
			hours++;
			int[] pos = q.poll();
			for (int[] dir : dirs) {
				int x = pos[0] + dir[0];
				int y = pos[1] + dir[1];

				if (x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 1) {
					continue;
				}

				humans--;
				grid[x][y] = 1;
				q.offer(new int[] { x, y });
				if (humans == 0) {
					return hours;
				}
			}
		}
		
		return -1;
	}
}
