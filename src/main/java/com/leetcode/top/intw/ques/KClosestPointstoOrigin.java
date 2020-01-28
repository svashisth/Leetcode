package com.leetcode.top.intw.ques;

import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class KClosestPointstoOrigin {

	public static void main(String[] args) {
		KClosestPointstoOrigin main = new KClosestPointstoOrigin();
		int[][] points = new int[][] {{1,2}, {2,3}, {4,3}, {-2,-3}, {-1,-4}, {2,1} };
		int K = 2;
		int[][] kClosest = main.kClosest(points, K);
		for (int[] is : kClosest) {
			System.out.println("main\t" + Arrays.toString(is));
		}
		
		int[][] points1 = new int[][] {{3,3}, {5,-1}, {-2, 4}};
		K = 2;
		kClosest = main.kClosest(points1, K);
		for (int[] is : kClosest) {
			System.out.println("main\t" + Arrays.toString(is));
		}
	}

	/** With mean heap
	 * We don't have to sort all points. Instead, we can maintain a max-heap with size K. 
	 * Then for each point, we add it to the heap. Once the size of the heap is greater than K, we are supposed to extract one from the max heap to ensure the 
	 * size of the heap is always K. Thus, the max heap is always maintain top K smallest elements from the first one to crruent one. Once the size of the heap 
	 * is over its maximum capacity, it will exclude the maximum element in it, since it can not be the proper candidate anymore.
	 * 
	 * Theoretically, the time complexity is O(NlogK), but pratically, the real time it takes on leetcode is 134ms.
	 * 
	 * The advantage of this solution is it can deal with real-time(online) stream data. It does not have to know the size of the data previously.
	 * The disadvatage of this solution is it is not the most efficient solution.
	 * 
	 * @param points
	 * @param K
	 * @return
	 */
	public int[][] kClosest(int[][] points, int K) {
	    PriorityQueue<int[]> pq = new PriorityQueue<int[]>((p1, p2) -> p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]);
	    for (int[] p : points) {
	        pq.offer(p);
	        if (pq.size() > K) {
	            pq.poll();
	        }
	    }
	    int[][] res = new int[K][2];
	    while (K > 0) {
	        res[--K] = pq.poll();
	    }
	    return res;
	}
	
	public int[][] kClosest_2(int[][] points, int K) {
	    Arrays.sort(points, (p1, p2) -> p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1]);
	    return Arrays.copyOfRange(points, 0, K);
	}
	
	public int[][] kClosest_1(int[][] points, int K) {
		if(points == null || points.length == 1)
		{
			return points;
		}
		Map<Double, String> map = new TreeMap<>();
		int[][] result = new int[K][2];
		for (int[] is : points) {
			double len = Math.pow(is[0], 2) + Math.pow(is[1], 2);
			map.put(len, map.getOrDefault(len, "").concat(is[0]+":"+is[1]+";"));
		}
		
		String[] coords = map.values().toArray(new String[0]);
		int cLoc = 0;
		for(int i = 0; i < K;)
		{
			String val = coords[cLoc++];	//take last one from sorted array (in asc order)
			String[] split = val.split(";");
			for (String string : split) {
				String[] coord = string.split(":");
				result[i][0] = Integer.valueOf(coord[0]);
				result[i++][1] = Integer.valueOf(coord[1]);
				if(i >= K)
				{
					break;
				}
			}
		}
		return result;
	}
}
