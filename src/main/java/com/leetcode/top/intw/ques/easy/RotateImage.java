/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/770/
 */
public class RotateImage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RotateImage main = new RotateImage();
		int[][] matrix = {
				  { 5, 1, 9,11},
				  { 2, 4, 8,10},
				  {13, 3, 6, 7},
				  {15,14,12,16}
				};
		main.rotate(matrix);
		System.out.println("After rotate\t" + Arrays.deepToString(matrix));
		
		int[][] matrix1 = {
				  { 5, 1, 9,11,17},
				  { 2, 4, 8,10,18},
				  {13, 3, 6, 7,19},
				  {15,14,12,16,20},
				  {21,22,23,24,25}
				};
		main.rotate(matrix1);
		System.out.println("After rotate\t" + Arrays.deepToString(matrix1));
		
		int[][] matrix2 = {
				  {1,2,3},
				  {4,5,6},
				  {7,8,9}
				};
		main.rotate(matrix2);
		System.out.println("After rotate\t" + Arrays.deepToString(matrix2));
	}

	public void rotate(int[][] matrix) {
		if(matrix.length == 1)
		{
			return;
		}
		transpose(matrix);
		System.out.println("After transpose\t" + Arrays.deepToString(matrix));
		for (int i = 0; i < matrix.length; i++) {
			 reverse(matrix[i]);
		}
	}

	/**
	 * @param matrix
	 */
	private void transpose(int[][] matrix) {
		int length = matrix.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < i; j++) {
				int a = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = a;
			}
		}
	}

	/**
	 * @param is
	 */
	private void reverse(int[] is) {
		int len = is.length - 1;
		for (int i = 0; i < is.length/2; i++) {
			int j = is[i];
			is[i] = is[len];
			is[len--] = j;
		}
	}
}
