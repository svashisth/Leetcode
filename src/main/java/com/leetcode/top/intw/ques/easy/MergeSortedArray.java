/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/96/sorting-and-searching/587/
 * 
 */
public class MergeSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MergeSortedArray main = new MergeSortedArray();
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {4,5,6};
		main.merge(nums1, 3, nums2, 3);
		System.out.println("main\t" + Arrays.toString(nums1));
		
		nums1 = new int[] {4,5,6,0,0,0};
		nums2 = new int[] {1,2,3};
		main.merge(nums1, 3, nums2, 3);
		System.out.println("main\t" + Arrays.toString(nums1));
		
		nums1 = new int[] {4,5,6,8,19,21,0,0,0};
		nums2 = new int[] {1,2,3};
		main.merge(nums1, 6, nums2, 3);
		System.out.println("main\t" + Arrays.toString(nums1));
		
		nums1 = new int[] {14,15,16,0,0,0,0,0,0,0,0,0};
		nums2 = new int[] {1,2,3,4,5,6,6,7,8};
		main.merge(nums1, 3, nums2, 9);
		System.out.println("main\t" + Arrays.toString(nums1));
		
		nums1 = new int[] {14,105,160,0,0,0,0,0,0,0,0,0};
		nums2 = new int[] {11,12,30,40,115,216,226,297,298};
		main.merge(nums1, 3, nums2, 9);
		System.out.println("main\t" + Arrays.toString(nums1));
		
		nums1 = new int[] {0,0,0,0,0,0,0,0,0};
		nums2 = new int[] {11,12,30,40,115,216,226,297,298};
		main.merge(nums1, 0, nums2, 9);
		System.out.println("main\t" + Arrays.toString(nums1));
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int p = m+n-1;
        
        while((p1 >= 0) && (p2>=0)){
            nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];
        }
        
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
	
	public void merge_1(int[] nums1, int m, int[] nums2, int n) {
		if(nums2 == null || nums2.length == 0)
		{
			return;
		}
		
		if(m==0 || nums2[0] > nums1[m-1])
		{
			System.arraycopy(nums2, 0, nums1, m, nums2.length);
			return;
		}

		if(nums1[0] > nums2[nums2.length-1])
		{
			int[] num = new int[nums1.length]; 
			System.arraycopy(nums1, 0, num, 0, nums1.length);
			System.arraycopy(nums2, 0, nums1, 0, nums2.length);
			System.arraycopy(num, 0, nums1, n, num.length-n);
			num = null;
			return;
		}
		
		System.arraycopy(nums2, 0, nums1, m, nums2.length);
		Arrays.sort(nums1);
	}

}
