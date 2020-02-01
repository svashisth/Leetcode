/**
 * 
 */
package com.leetcode.top.intw.ques;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * https://leetcode.com/discuss/interview-question/347457
 */
public class TreasureIsland {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreasureIsland main = new TreasureIsland();
		
		char[][] grid = new char[][]
			{
			 {'O', 'O', 'O', 'O'},
			 {'D', 'O', 'D', 'O'},
			 {'O', 'O', 'O', 'O'},
			 {'X', 'D', 'D', 'O'}
			};
		int steps = main.getSteps(grid);
		System.out.println("main\t" + steps);
	}
	
	public int getSteps(char[][] grid)
	{
		int rows = grid.length;
		int cols = grid[0].length;
		
		Queue<int[]> q = new ArrayDeque<int[]>();
		q.offer(new int[] {0,0});
		grid[0][0] = '1';
		
		int steps = 0;
		int[][] dirs = new int[][] { {0,1}, {0,-1}, {1,0}, {-1,0} };
		while(!q.isEmpty())
		{
			for(int a = 0; a < q.size(); a++)
			{
				int[] pos = q.poll();
				for (int[] dir : dirs) {
					int r = pos[0] + dir[0];
					int c = pos[1] + dir[1];
					
					if(r<0 || c < 0 || r >= rows || c >= cols || grid[r][c] == 'D')
					{
						continue;
					}
					if(grid[r][c] == 'X')
					{
						return steps;
					}
					if(grid[r][c] != '1')
					{
						q.add(new int[] {r, c});
						grid[r][c] = '1';
					}
				}
			}
			steps++;
		}
		
		return -1;
	}

}
