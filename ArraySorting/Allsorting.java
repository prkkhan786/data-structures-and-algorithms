package ArraySorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Allsorting {
	public static void main(String[] args) 
	{
		for(int i =0;i<10;i++){
			System.out.println(i%3);
		}
		
	}

	public static void bubblesort(int arr[]) {
		int n = arr.length - 1;
		int jc = 1;
		while (jc <= n) {
			for (int i = 0; i < n - jc; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
			jc++;
		}
	}

	public static void selectionsort(int arr[]) {
		int n = arr.length - 1;
		int jc = 1;
		while (jc <= n) {
			for (int i = jc; i > 0; i++) {
				if (arr[i] < arr[jc - 1]) {
					swap(arr, i, jc - 1);
				} else {
					break;
				}
			}
			jc++;
		}
	}

	public static void reversearray(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
	}

	public static void insertionsort(int arr[]) {
		int n = arr.length - 1;
		int jc = 1;
		while (jc <= n) {
			for (int i = jc; i > 0; i--) {
				if (arr[i] < arr[i - 1]) {
					swap(arr, i, i - 1);
				}
			}
			jc++;
		}
	}

	public static void myselectionsor(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

	public static void selectionsorting(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					swap(arr, i, j);
				}
			}
		}
	}

	public static void inversearray(int arr[]) {
		int inv[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			inv[arr[i]] = i;
		}
	}

	public static void ismirrorinverse(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			if (arr[val] != i) {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
	}

	public static void rotatearray(int arr[], int n) {

	}

	public static void reverse(int arr[], int left, int right) {
		while (left < right) {
			swap(arr, left, right);
			left++;
			right--;
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printsubsqunce(String s) {
		for (int i = 0; i < (i << s.length()); i++) {
			for (int j = s.length() - 1; j >= 0; j--) {
				int mask = 1 << j;
				if ((i & mask) != 0) { // bit is on
					System.out.print(s.charAt(s.length() - 1 - j));
				}
			}
			System.out.println();
		}
	}

	public static void compressstring(String src) {
		HashMap<Character, Integer> h = new HashMap();
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if (h.containsKey(ch)) {
				h.put(ch, h.get(ch) + 1);
			} else {
				h.put(ch, 1);
			}
		}
		for (char ch : h.keySet()) {
			System.out.println(ch);
		}
	}

	public static void quicksort(int arr[], int low, int hi) {

		if (low >= hi) {
			return;
		}
		int pivot = arr[hi];
		int pi = partition(arr, low, hi, pivot);
		quicksort(arr, low, pi - 1);
		quicksort(arr, pi + 1, hi);

	}

	private static int partition(int[] arr, int low, int hi, int pivot) {
		int itr = low;
		int pi = low;
		while (itr <= hi) {
			if (arr[itr] <= pivot) {
				int temp = arr[itr];
				arr[itr] = arr[pi];
				arr[pi] = temp;
				itr++;
				pi++;
			} else {
				itr++;
			}
		}
		return pi - 1;
	}
	
	public static void reversequeue(Queue<Integer> a){
		Stack<Integer> st = new Stack<>();
		
		while(!a.isEmpty()){
			st.push(a.remove());
		}
		
		Queue<Integer> ans = new LinkedList<>();
		while(st.size()!=0){
			ans.add(st.pop());
		}
		
		while(!ans.isEmpty()){
			System.out.println(ans.poll());
		}
		
		
		
	}
}
