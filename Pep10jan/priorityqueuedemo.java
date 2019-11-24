package Pep10jan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class priorityqueuedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = { 2, 15, 18, 3, 77, 6, 11, 14, 9 };
//		kthlargest2(arr, 4);
		int a[] = {20,30,10,60,40,70,50,80,100,90};

		//int arrr[][] = { { 5, 10, 15, 20, 22 }, { 6, 18, 24 }, { 7, 19, 27, 35, 45 }, };
		//arrayprint(arrr);
		kthsorted(a, 2);
		
	}

	public static void kthlargest(int arr[], int k) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		for (int i : arr) {
			p.add(i);
		}
		for (int i = 0; i < k; i++) {
			System.out.println(p.remove());
		}
	}

	public static void kthlargest2(int arr[], int k) {
		PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : arr) {
			if (p.size() < k) {
				p.add(i);
			} else if (i > p.peek()) {
				p.remove();
				p.add(i);
			}
		}
	}

	private static class pair implements Comparable<pair> {
		int data;
		int index;
		int counter;

		public pair(int data, int index, int counter) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.index = index;
			this.counter = counter;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return this.data - o.data;
		}
	}

	public static void arrayprint(int arrr[][]) {
		PriorityQueue<pair> p = new PriorityQueue<>();
		for (int i = 0; i < arrr.length; i++) {
			p.add(new pair(arrr[i][0], i, 0));
		}
		while (p.size() > 0) {
			pair r = p.remove(); // give the smallest data pair
			System.out.println(r.data);
			r.counter++;
			if (r.counter < arrr[r.index].length) {
				p.add(new pair(arrr[r.index][r.counter], r.index, r.counter));
			}
		}
	}
	public static void kthsorted(int arr[], int k) {
		PriorityQueue<Integer> reg = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			reg.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if (arr[i] < reg.peek()) {
				System.out.print(arr[i] + " ");
			} else {
				System.out.print(reg.remove()+" ");
				reg.add(arr[i]);
			}
		}
		while (reg.size() > 0) {
			System.out.print(reg.remove()+ " ");
		}
	}
}
