package com.leetcode.top.intw.ques.hard;

/**
 * https://leetcode.com/problems/integer-to-english-words/
 *
 */
public class IntegertoEnglishWords {

	public static void main(String[] args) {
		IntegertoEnglishWords w = new IntegertoEnglishWords();
		String numberToWords = w.numberToWords(123);
		System.out.println(numberToWords);
		
		numberToWords = w.numberToWords(1123);
		System.out.println(numberToWords);
		
		numberToWords = w.numberToWords(4432123);
		System.out.println(numberToWords);
	}
	private final String[] belowTen = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private final String[] belowTwenty = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] belowHundred = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	
	public String numberToWords(int num) {
		 if (num == 0) return "Zero";
	        return getString(num);
	}

	private String getString(int num) {
        StringBuilder result = new StringBuilder();
        if (num < 10) result.append(belowTen[num]);
        else if (num < 20) result.append(belowTwenty[num -10]);
        else if (num < 100) result.append(belowHundred[num/10] + " " + getString(num % 10));
        else if (num < 1000) result.append(getString(num/100) + " Hundred " +  getString(num % 100));
        else if (num < 1000000) result.append(getString(num/1000) + " Thousand " +  getString(num % 1000));
        else if (num < 1000000000) result.append(getString(num/1000000) + " Million " +  getString(num % 1000000));
        else result.append(getString(num/1000000000) + " Billion " + getString(num % 1000000000));
        return result.toString();
    }
}
