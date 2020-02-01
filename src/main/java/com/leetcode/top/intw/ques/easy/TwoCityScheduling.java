/**
 * 
 */
package com.leetcode.top.intw.ques.easy;

import java.util.Arrays;

/**
 * @author AD79272
 *
 */
public class TwoCityScheduling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TwoCityScheduling main = new TwoCityScheduling();
		int[][] costs = new int[][] {{10,20}, {30,200}, {400,50}, {30,20}};
		int cost = main.twoCitySchedCost(costs);
		System.out.println("main\t" + cost);
		
		costs = new int[][] {{10,20}, {300,20}, {40,500}, {30,20}};
		cost = main.twoCitySchedCost(costs);
		System.out.println("main\t" + cost);
		
		costs = new int[][] {{10,20}, {300,20}, {40,500}, {30,20}, {40,40}, {10,30}};
		cost = main.twoCitySchedCost(costs);
		System.out.println("main\t" + cost);
		
		costs = new int[][] {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
		cost = main.twoCitySchedCost(costs);
		System.out.println("main\t" + cost);
	}

	public int twoCitySchedCost(int[][] costs) {
		if(costs == null || costs.length == 0)
		{
			return 0;
		}
		Arrays.parallelSort(costs, (a,b) -> Integer.compare(a[0]-a[1], b[0]-b[1]));
		System.out.println("twoCitySchedCost\t" + Arrays.deepToString(costs));
		
		int cost = 0;
		int len = costs.length;
		for(int i = 0; i < len; i++)
		{
			if(i >= len/2)
			{
				cost+=costs[i][1];
			}
			else
			{
				cost+=costs[i][0];
			}
		}
		
		return cost;
	}

}
