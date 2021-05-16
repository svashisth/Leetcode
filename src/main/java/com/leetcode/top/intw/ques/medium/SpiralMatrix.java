package com.leetcode.top.intw.ques.medium;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/spiral-matrix/
 *  (Not complete)
 * @author sunil
 *
 */
public class SpiralMatrix {

	public static void main(String[] args) 
	{
		int[][] mat = new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		List<Integer> list = spiralOrder(mat);
		System.out.println(list);

	}

	public static List<Integer> spiralOrder(int[][] matrix) 
	{
		if(matrix == null || matrix.length == 0)
		{
			return Collections.emptyList();
		}
		
		int rows = matrix.length;
		int columns = matrix[0].length;
		int total = rows * columns;
		int r = 0, c = 0;
		int minRow = 0, minCol = 0;
		List<Integer> list = new LinkedList<Integer>();
		String dir = "R"; //D, L, U 
		for(int a=0; a < total; a++)
		{
			System.out.println("-> " + list);
			list.add(matrix[r][c]);
			switch (dir) {
				case "R":
					c++;
					if(c >= (columns - 1))
					{
						dir = "D";
						columns -= 1;
					}
				break;
				case "L":
					c--;
					if(c <= minCol)
					{
						dir = "U";
						minCol -= 1;
					}
				break;
				case "D":
					r++;
					if(r >= (rows - 1))
					{
						dir = "L";
						rows-=1;
					}
				break;
				case "U":
					r--;
					if(r <= minRow)
					{
						dir = "R";
						minRow-=1;
					}
				break;
			default:
				break;
			}
		}
		
		return list;
	}
}
