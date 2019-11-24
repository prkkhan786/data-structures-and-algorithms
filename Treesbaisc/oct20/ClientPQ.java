package oct20;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class ClientPQ {

	public static void main(String[] args) {
		// normal pq is min pq
//		PriorityQueue<Integer> ranks = new PriorityQueue<>();
//		ranks.add(10);
//		ranks.add(2000);
//		ranks.add(5);
//		ranks.add(40000);
//		ranks.add(30);
//		
//		while(ranks.size() > 0){
//			System.out.println(ranks.peek() + " " + ranks.remove());
//		}
		
		// for max pq use reverse pq
//		PriorityQueue<Integer> marks = 
//				new PriorityQueue<>(Collections.reverseOrder());
//		marks.add(66);
//		marks.add(91);
//		marks.add(99);
//		marks.add(43);
//		
//		while(marks.size() > 0){
//			System.out.println(marks.peek() + " " + marks.remove());
//		}
//		int[] arr = {10, 23, 1, 14, 7, 42, 99};
//		printksmallestbetter(arr, 3);
//		heapSortSpace(arr);
//		for(int val: arr){
//			System.out.print(val + " ");
//		}
//		System.out.println(".");
		
//		MedianPQ mpq = new MedianPQ();
//		mpq.add(10);
//		mpq.add(50);
//		mpq.add(30);
//		System.out.println(mpq.peek());
//		mpq.add(40);
//		mpq.add(70);
//		System.out.println(mpq.peek());
//		mpq.add(90);
//		mpq.add(100);
//		System.out.println(mpq.remove());
//		mpq.add(45);
//		System.out.println(mpq.peek());
//		System.out.println(mpq.remove());
//		mpq.add(75);
//		System.out.println(mpq.remove());
//		System.out.println(mpq.remove());
	
		
		int[] arr = {30, 10, 20, 60, 50, 40, 80, 70};
		sortKSorted(arr, 2);
	}
	
	// space - n, time - nlogn
	public static void printksmallest(int[] arr, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int val: arr){
			pq.add(val);
		}
		
		for(int i = 0; i < k; i++){
			System.out.println(pq.remove());
		}
	}
	
	// space - k, complexity - nlogk
	public static void printksmallestbetter(int[] arr, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < k; i++){
			pq.add(arr[i]);
		}
		
		for(int i = k; i < arr.length; i++){
			if(arr[i] < pq.peek()){
				pq.remove();
				pq.add(arr[i]);
			}
		}
		
		System.out.println(pq);
	}
	
	public static void heapSortSpace(int[] arr){
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int val: arr){
			pq.add(val);
		}
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = pq.remove();
		}
	}

	public static void sortKSorted(int[] arr, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i = 0; i < arr.length || pq.size() > 0; i++){
			if(i <= k){
				pq.add(arr[i]);
			} else if(i < arr.length){
				System.out.println(pq.remove());
				pq.add(arr[i]);
			} else {
				System.out.println(pq.remove());
			}
		}
	}
	
	
	
	
	
	
	
	

}
