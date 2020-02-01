/**
 * 
 */
package com.leetcode.top.intw.ques;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author AD79272
 *
 */
public class NumberOfIslands {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumberOfIslands main = new NumberOfIslands();
		
		char[][] grid = new char[][]
			{
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','0','0'}
			};
		int numIslands = main.numIslands(grid);
		System.out.println("main\t" + numIslands);
		
		grid = new char[][]
				{
					{'1','1','1','0','0'},
					{'1','1','0','0','0'},
					{'0','0','1','0','0'},
					{'0','0','0','1','1'}
				};
		numIslands = main.numIslands(grid);
		System.out.println("main\t" + numIslands);
		
		grid = new char[][]
				{
					{'0','1','1','0','0'},
					{'1','1','0','0','0'},
					{'0','0','1','0','0'},
					{'0','0','0','1','1'}
				};
		numIslands = main.numIslands(grid);
		System.out.println("main\t" + numIslands);
		
		grid = new char[][]
				{
					{'0','0','1','0','0'},
					{'1','1','0','0','0'},
					{'0','0','1','0','0'},
					{'0','0','0','1','1'}
				};
		numIslands = main.numIslands(grid);
		System.out.println("main\t" + numIslands);
	}

	public int numIslands(char[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;
		
		boolean[][] visited = new boolean[rows][cols];
		int count = 0;
		Queue<int[]> q = new ArrayDeque<int[]>();
		q.offer(new int[] {0,0});
		if(grid[0][0] == '1')
		{
			count++;
			visited[0][0] = true;
		}
		
		int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
		while(! q.isEmpty())
		{
			for(int s = 0; s < q.size(); s++)
			{
				int[] poll = q.poll();
				for (int[] dir : dirs) {
					int x = poll[0] + dir[0];
					int y = poll[1] + dir[1];
					
					if(x < 0 || y < 0 || x >= rows || y >= cols || visited[x][y])
					{
						continue;
					}
					visited[x][y] = true;
					if(grid[x][y] == '1')
					{
						if(x - 1 > 0 && y - 1 > 0)
						{
							if(grid[x-1][y] == '0' && grid[x][y-1] == '0')
							{
								count++;
							}
						}
						if(y-1 < 0 && x-1 >= 0)
						{
							if(grid[x-1][y] == '0')
							{
								count++;
							}
						}
						if(x - 1 < 0 && y-1 >= 0)
						{
							if(grid[x][y-1] == '0')
							{
								count++;
							}
						}
					}
					q.offer(new int[] {x,y});
				}
			}
			
		}
		
		return count;
	}

}
