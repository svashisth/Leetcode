package com.leetcode.top.intw.ques.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
 *
 */
public class KthSmallest {

	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1,4,100,103},{3,9,101,104},{7,10,102,105}};
		System.out.println("len\t" + matrix[0].length);
		
		int kthSmallest = new KthSmallest().kthSmallest(matrix, 6);
		System.out.println("main 6\t" + kthSmallest);
		
		kthSmallest = new KthSmallest().kthSmallest(matrix, 4);
		System.out.println("main 4\t" + kthSmallest);
	}

	public int kthSmallest_1(int[][] matrix, int k) {
		if(matrix.length == 0)
		{
			return 0;
		}
		int r = matrix.length;
		int c = matrix[0].length;
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int row = 0, col = 0;
		for(int i = 0; i < r*c; i++)
		{
			pq.add(matrix[row][col++]);
			if(col >= c)
			{
				row++;
				col = 0;
			}
		}
		
		for(int i=0; i < k-1; i++)
		{
			pq.poll();
		}
		
		return pq.poll();
	}
	
	public int kthSmallest(int[][] matrix, int k) {
		if(matrix.length == 0)
		{
			return 0;
		}
		int r = matrix.length;
		int c = matrix[0].length;
		
		int combined[] = new int[r*c];
		
		int row = 0, col = 0;
		for(int i = 0; i < r*c; i++)
		{
			combined[i] = matrix[row][col++];
			if(col >= c)
			{
				row++;
				col = 0;
			}
		}
		Arrays.sort(combined);
		return combined[k-1];
	}
}
