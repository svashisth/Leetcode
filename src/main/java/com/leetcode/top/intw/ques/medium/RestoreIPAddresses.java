package com.leetcode.top.intw.ques.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/restore-ip-addresses/
 * 
 * @author sunil
 *
 */
public class RestoreIPAddresses {

	public static void main(String[] args) {
		List<String> ipAddresses = restoreIpAddresses("1100010");
		System.out.println(ipAddresses);
		
		ipAddresses = restoreIpAddresses("25525511135");
		System.out.println(ipAddresses);
		
		ipAddresses = restoreIpAddresses("101023");
		System.out.println(ipAddresses);
	}

	public static List<String> restoreIpAddresses(String s) {
		if (s == null || s.isEmpty()) {
			return Collections.emptyList();
		}
		if (s.length() > 12) {
			return Collections.emptyList();
		}

		List<String> list = new ArrayList<String>();
		StringBuilder toTest = new StringBuilder();
		for(int i = 0 ; i < 3 ; i++)
		{
			for(int j = i+1 ; j < 6 ; j++)
			{
				for(int k = j+1 ; k < 9 ; k++)
				{
					for(int l = k+1 ; l < s.length() ; l++)
					{
						String a = s.substring(i, j);
						String b = s.substring(j, k);
						String c = s.substring(k, l);
						String d = s.substring(l);
//						System.out.println(a + "." + b + "." + c + "." + d);
						if(isValid(a) && isValid(b) && isValid(c) && isValid(d))
						{
							toTest.append(a).append(".").append(b).append(".").append(c).append(".").append(d);
							String string = toTest.toString();
							if(s.length() + 3 == string.length())
							{
								list.add(string);
							}
							toTest.setLength(0);
						}
					}
				}
			}
		}

		return list;
	}

	private static boolean isValid(String part) {
		if(part == null || part.isEmpty())
		{
			return false;
		}
		if(part.startsWith("0") && part.length() > 1)
		{
			return false;
		}
		int val = Integer.parseInt(part);
		if(val > 255)
		{
			return false;
		}
		return true;
	}

}
