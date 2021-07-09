/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

/**
 * https://leetcode.com/problems/excel-sheet-column-number/
 *
 */
public class ExcelSheetColumnNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExcelSheetColumnNumber main = new ExcelSheetColumnNumber();
		int titleToNumber = main.titleToNumber("A");
		System.out.println("main\t" + titleToNumber);

		titleToNumber = main.titleToNumber("y");
		System.out.println("main\t" + titleToNumber);

		titleToNumber = main.titleToNumber("AB");
		System.out.println("main\t" + titleToNumber);

		titleToNumber = main.titleToNumber("YZ");
		System.out.println("main\t" + titleToNumber);

		titleToNumber = main.titleToNumber("ZY");
		System.out.println("main\t" + titleToNumber);

		titleToNumber = main.titleToNumber("AAA");
		System.out.println("main\t" + titleToNumber);
	}

	public int titleToNumber(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		}

		int n = s.length();
		int sum = 0;
		sum = sum + (s.charAt(n - 1) - 64);

		for (int i = n - 2; i >= 0; i--) {
			sum = sum + (int) Math.pow(26, n - i - 1) * (s.charAt(i) - 64);
		}

		return sum;
	}
}
