package com.leetcode.top.intw.ques.medium;

public class ValidateIPAddress {

	public static void main(String[] args) {

	}

	public String validIPAddress(String IP) {
		String type = "neither";
		if (IP == null || IP.isEmpty() || !(IP.contains(":") || IP.contains("."))) {
			return type;
		}
		int len = IP.length();
		if ((IP.contains(".") && len > 15) || (IP.contains(":") && len > 39)) {
			return type;
		}
		if (IP.contains(".") && isValidIPv4(IP)) {
			type = "IPv4";
		}
		if (IP.contains(":") && isValidIPv6(IP)) {
			type = "IPv6";
		}
		return type;
	}

	private boolean isValidIPv6(String ip) {
		if (ip.contains(".")) {
			return false;
		}

		return true;
	}

	private boolean isValidIPv4(String ip) {
		if (ip.contains(":") || ip.matches("[a-zA-Z]*")) {
			return false;
		}
		String[] split = ip.split(".");
		if (split.length != 4) {
			return false;
		}
		for (String block : split) {
			if (block.length() > 3 || block.matches("^[a-zA-Z]*$")) {
				return false;
			}
			int val = 0;
			try {
				val = Integer.parseInt(block);
			} catch (Exception e) {
				return false;
			}
			if (val > 255) {
				return false;
			}
		}
		return true;
	}
}
