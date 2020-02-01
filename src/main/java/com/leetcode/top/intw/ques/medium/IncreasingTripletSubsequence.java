package com.leetcode.top.intw.ques.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/increasing-triplet-subsequence/
 *
 */
public class IncreasingTripletSubsequence {

	public static void main(String[] args) {
		IncreasingTripletSubsequence main = new IncreasingTripletSubsequence();
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		boolean increasingTriplet = main.increasingTriplet(arr);
		System.out.println(Arrays.toString(arr) + "\t" + increasingTriplet);

		int[] arr1 = new int[] { 5, 4, 3, 2, 1 };
		increasingTriplet = main.increasingTriplet(arr1);
		System.out.println(Arrays.toString(arr1) + "\t" + increasingTriplet);

		int[] arr2 = new int[] { 2, 4, 3, 2, 4, 6 };
		increasingTriplet = main.increasingTriplet(arr2);
		System.out.println(Arrays.toString(arr2) + "\t" + increasingTriplet);

		int[] arr3 = new int[] { 209, 79, 725, 229, 694, 595, 925, 912, 462, 388, 612, 130, 694, 146, 188, 24, 685, 932,
				792, 236, 773, 487, 64, 612, 411, 630, 963, 735, 752, 366 };
		increasingTriplet = main.increasingTriplet(arr3);
		System.out.println("main\t" + increasingTriplet);

		int[] arr4 = new int[] { 5, 4, 3, 2, 1, 6, 9 };
		increasingTriplet = main.increasingTriplet(arr4);
		System.out.println(Arrays.toString(arr4) + "\t" + increasingTriplet);

		int[] arr5 = new int[] { 5, 1, 5, 5, 2, 5, 4 };
		increasingTriplet = main.increasingTriplet(arr5);
		System.out.println(Arrays.toString(arr5) + "\t" + increasingTriplet);

		int[] arr6 = new int[] { 5, 1, 5, 5, 2, 7, 4 };
		increasingTriplet = main.increasingTriplet(arr6);
		System.out.println(Arrays.toString(arr6) + "\t" + increasingTriplet);

		int[] arr7 = new int[] { 5, 5, 5, 5, 2, 7, 4, 6 };
		increasingTriplet = main.increasingTriplet(arr7);
		System.out.println(Arrays.toString(arr7) + "\t" + increasingTriplet);

		int[] arr8 = new int[] { 5, 5, 7, 2, 4, 6 };
		increasingTriplet = main.increasingTriplet(arr8);
		System.out.println(Arrays.toString(arr8) + "\t" + increasingTriplet);

		int[] arr9 = new int[] { 1, 2, -10, -8, -7 };
		increasingTriplet = main.increasingTriplet(arr9);
		System.out.println(Arrays.toString(arr9) + "\t" + increasingTriplet);
	}

	/**
	 * The main idea is keep two values when check all elements in the array: the
	 * minimum value min until now and the second minimum value secondMin from the
	 * minimum value's position until now. Then if we can find the third one that
	 * larger than those two values at the same time, it must exists the triplet
	 * subsequence and return true.
	 * 
	 * @param nums
	 * @return
	 */
	public boolean increasingTriplet(int[] nums) {
		if (nums ==  null || nums.length < 3 ){
            return false;
        }
		int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		for (int num : nums) {
			if (num <= min)
				min = num;
			else if (num < secondMin)
				secondMin = num;
			else if (num > secondMin)
				return true;
		}
		return false;
	}

	public boolean increasingTriplet_1(int[] nums) {
		if (nums == null || nums.length < 3) {
			return false;
		}

		int first = 1, second = 2;
		int fh = nums[0];
		while (second < nums.length) {
			System.out.println("fh=" + fh + " -- first=" + first + "\tsecond=" + second);
			if (fh < nums[first] && nums[first] < nums[second]) {
				return true;
			}
			if (nums[first] <= fh) {
				fh = nums[first];
				first++;
			}
			if (nums[second] <= nums[first]) {
				second++;
			}
			if (first < second && first < nums.length - 1) {
				if (nums[first] >= nums[first + 1] && nums[first + 1] > fh) {
					first++;
				}
			}
		}
		return false;
	}
}
