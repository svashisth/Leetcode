/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/769/
 */
public class ValidSudoku {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ValidSudoku main = new ValidSudoku();

		char board[][] = { 
				{ '5', '3', '.', '.', '7', '.', '.', '.', '.' }, 
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, 
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' }, 
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, 
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' }, 
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, 
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, 
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, 
                { '.', '.', '5', '.', '8', '.', '.', '7', '9' } 
                }; 
		boolean validSudoku = main.isValidSudoku(board);
		System.out.println("validSudoku:\t" + validSudoku);
		
		char board1[][] = {
					{'.','.','4','.','.','.','6','3','.'},
					{'.','.','.','.','.','.','.','.','.'},
					{'5','.','.','.','.','.','.','9','.'},
					{'.','.','.','5','6','.','.','.','.'},
					{'4','.','3','.','.','.','.','.','1'},
					{'.','.','.','7','.','.','.','.','.'},
					{'.','.','.','5','.','.','.','.','.'},
					{'.','.','.','.','.','.','.','.','.'},
					{'.','.','.','.','.','.','.','.','.'}};
		validSudoku = main.isValidSudoku(board1);
		System.out.println("validSudoku:\t" + validSudoku);
	}

	public boolean isValidSudoku(char[][] board) {
		boolean result = true;
        for(int i=0; i < 9; i++)
        {
        	result = validate(board[i]);	//validate rows
        	if(! result)
        	{
        		return result;
        	}
        	result = validate(getColumn(board, i));	//validate columns
        	if(! result)
        	{
        		return result;
        	}
        	result = validate(getSquare(board,i));	//validate squares
        	if(! result)
        	{
        		return result;
        	}
        }
        
        return result;
    }

	/**
	 * @param board 
	 * @param i
	 * @return
	 */
	private char[] getSquare(char[][] board, int i) {
		char[] res = new char[board.length];
		int row = i > 2 ? (i > 5 ? 6 : 3) : 0;
		int column = (i % 3) * 3;
		int indx = 0;
		for (int j = row; j < row + 3; j++) {
			for (int k = column; k < column+3; k++) {
				res[indx++] = board[j][k];
			}
		}
		return res;
	}

	/**
	 * @param board
	 * @param i
	 * @return
	 */
	private char[] getColumn(char[][] board, int no) {
		char[] res = new char[board.length];
		for(int i =0; i<9; i++)
		{
			res[i] = board[i][no];
		}
		return res;
	}

	/**
	 * @param cs
	 * @return
	 */
	private boolean validate(char[] cs) {
		Map<Character, String> map = new HashMap<>();
		for (int i = 0; i < cs.length; i++) {
			if(cs[i] != '.' && map.containsKey(cs[i]))
			{
				return false;
			}
			map.put(cs[i], "");
		}
		
		return true;
	}
}
