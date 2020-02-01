/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author AD79272
 *
 */
public class ReorderDataInLogFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReorderDataInLogFiles main = new ReorderDataInLogFiles();
		
		String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		String[] reorderLogFiles = main.reorderLogFiles(logs);
		System.out.println("main\t" + Arrays.toString(reorderLogFiles));
	}

	public String[] reorderLogFiles(String[] logs) {
		if(logs == null || logs.length == 0)
		{
			return new String[0];
		}
		Set<String> letterLogs = new TreeSet<>();
		List<String> digitLogs = new ArrayList<>();
		for (String log : logs) {
			if(!isDigitLog(log.substring(log.indexOf(" "))))
			{
				letterLogs.add(modified(log));
			}
			if(isDigitLog(log.substring(log.indexOf(" "))))
			{
				digitLogs.add(log);	
			}
		} 
		
		String[] res = new String[logs.length];
		int indx = 0;
		for (String log : letterLogs) {
			res[indx++] = revert(log);
		}
		for (String log : digitLogs) {
			res[indx++] = log;
		}
		
		return res;
	}

	/**
	 * @param log
	 * @return
	 */
	private String modified(String log) {
		String substring1 = log.substring(log.indexOf(" "));
		String header = log.substring(0,log.indexOf(" "));
		return substring1.concat(" ").concat(header);
	}

	/**
	 * @param log
	 * @return
	 */
	private String revert(String log) {
		String header = log.substring(log.lastIndexOf(" "));
		String str = log.substring(0,log.lastIndexOf(" "));
		return header.concat(str).trim();
	}
	
	/**
	 * @param log
	 * @return
	 */
	private boolean isDigitLog(String log) {
		return log.matches(".*\\d+.*");
	}
	
}
