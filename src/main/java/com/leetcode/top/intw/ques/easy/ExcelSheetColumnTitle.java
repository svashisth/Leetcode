package com.leetcode.top.intw.ques.easy;

/**
 * https://leetcode.com/problems/excel-sheet-column-title/
 * @author Sunil
 *
 */
public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		String colName = convertToTitle(701);
		System.out.println(colName);
		
		colName = convertToTitle(26);
		System.out.println(colName);
		
		colName = convertToTitle(52);
		System.out.println(colName);
		
		colName = convertToTitle(2147483647);
		System.out.println(colName);
	}

	public static String convertToTitle(int columnNumber) {
		StringBuilder sb = new StringBuilder();
		while(columnNumber > 0){
            columnNumber--;
            int curr = columnNumber%26;
            columnNumber /= 26;
            sb.append((char)(curr+'A'));
        }
        return sb.reverse().toString();
	}
}
