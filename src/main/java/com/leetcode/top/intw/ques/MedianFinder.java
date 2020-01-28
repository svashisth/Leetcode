package com.leetcode.top.intw.ques;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/find-median-from-data-stream/
 *
 */
class MedianFinder {
	Queue<Integer> minQ;
	Queue<Integer> maxQ;
	
    public MedianFinder() {
		minQ = new PriorityQueue<Integer>();
		maxQ = new PriorityQueue<Integer>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
    	 maxQ.offer(num);
         minQ.offer(maxQ.poll());
         if (maxQ.size() < minQ.size()){
             maxQ.offer(minQ.poll());
         }
    }
    
    public double findMedian() {
    	if(maxQ.size() == minQ.size())
    	{
    		return (maxQ.peek() + minQ.peek())/2.0;
    	}
    	
        return maxQ.peek();
    }
    
	public static void main(String[] args) {
		MedianFinder main = new MedianFinder();
		for(int i=1; i < 70; i++)
		{
			main.addNum(i);
		}
		System.out.println("max Q size\t" + main.maxQ.size());
		System.out.println("max Q\t" + main.maxQ);
		System.out.println("max Q peek\t" + main.maxQ.peek());
		System.out.println("min Q size\t" + main.minQ.size());
		System.out.println("min Q\t" + main.minQ);
		System.out.println("min Q peek\t" + main.minQ.peek());
		
		System.out.println("main\t" + main.findMedian());
	}

}