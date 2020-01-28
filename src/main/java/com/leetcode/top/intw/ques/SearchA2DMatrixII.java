package com.leetcode.top.intw.ques;

public class SearchA2DMatrixII {

	public static void main(String[] args) {
		SearchA2DMatrixII main = new SearchA2DMatrixII();
		int[][] matrix = new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 },
				{ 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } };
		int target = 26;
		boolean result = main.searchMatrix(matrix, target);
		System.out.println("main\t" + result);

		matrix = new int[][] { {} };
		target = 1;
		result = main.searchMatrix(matrix, target);
		System.out.println("main\t" + result);
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		if (target < matrix[0][0]) {
			return false;
		}

		int row = matrix.length - 1;
		int col = matrix[0].length - 1;
		int i = row, j = 0;
		while (i >= 0 && j <= col) {
			if (target > matrix[i][j]) {
				j++;
			} else if (target < matrix[i][j]) {
				i--;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean searchMatrix_1(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		if (target < matrix[0][0]) {
			return false;
		}

		for (int i = 0; i < matrix.length; i++) // i - row
		{
			for (int j = 0; j < matrix[i].length; j++) // j - column
			{
				if (matrix[i][j] > target) {
					break;
				}
				if (matrix[i][j] == target) {
					return true;
				}
			}
		}

		return false;
	}
}
