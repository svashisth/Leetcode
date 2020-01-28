package com.leetcode.top.intw.ques;

public class SearchA2DMatrix {

	public static void main(String[] args) {
		SearchA2DMatrix main = new SearchA2DMatrix();
		int[][] matrix = new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 },
				{ 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } };
		int target = 26;
		boolean result = main.searchMatrix(matrix, target);
		System.out.println("main\t" + result);

		matrix = new int[][] { {} };
		target = 1;
		result = main.searchMatrix(matrix, target);
		System.out.println("main\t" + result);
		
		matrix = new int[][] { 
								{1,3,5,7},
								{10,11,16,20},
								{23,30,34,50}
							   };
		target = 3;
		result = main.searchMatrix(matrix, target);
		System.out.println("main\t" + result);
		
		target = 13;
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
		int i = 0, j = col;
		while (i <= row && j >= 0) {
			if (target > matrix[i][j]) {
				i++;
			} else if (target < matrix[i][j]) {
				j--;
			} else {
				return true;
			}
		}
		return false;
	}
}
