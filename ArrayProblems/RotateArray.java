package ArrayProblems;

import java.util.Arrays;
import July22.ReverseArray;

public class RotateArray {
	public static void main(String[] args) {
		int arr[] = { 4,7,3,2,1,4};
		
		qicksort(arr, 0, arr.length-1);
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	private static int bubblesort(int[] arr, int d) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (d > arr[mid]) {
				lo = mid + 1;
			} else if (d < arr[mid]) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void bubble2(int[] arr) {
		int n = arr.length;
		for (int jc = 1; jc <= n - 1; jc++) {
			for (int j = 0; j <= n - 1 - jc; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	private static void swap(int[] arr, int j, int i) {
		int temp;
		temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	private static void arrayrotate(int arr[], int d) {
		int left = 0;
		int right = arr.length - 1;
		reverse(left, d - 1, arr);
		reverse(d, right, arr);
		reverse(left, right, arr);
	}

	private static void reverse(int left, int i, int[] arr) {
		while (left < i) {
			swap(arr, left, i);
			left++;
			i--;
		}

	}

	public static void selectionsort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i <= n - 1; i++) {

			int minidx = i;
			for (int j = i + 1; j <= n - 1; j++) {
				if (arr[j] < arr[minidx]) {
					minidx = j;
				}
			}

			int temp = arr[minidx];
			arr[minidx] = arr[i];
			arr[i] = temp;
		}
	}

	public static void b(int arr[]) {
		int jc = 1;
		while (jc <= arr.length - 1) {
			for (int i = 0; i <= arr.length - 1 - jc; i++) {
				if (arr[i] > arr[i + 1])
					swap(arr, i, i + 1);
			}
			jc++;
		}
	}

	public static void selectionsort1(int arr[]) {
		int jc = 1;
		while (jc <= arr.length - 1) {
			for (int i = jc; i > 0; i--) {
				if (arr[i] < arr[i - 1]) {
					swap(arr, i, i - 1);
				} else {
					break;
				}
			}
			jc++;
		}
	}

	public static void recursivebubblesort(int arr[], int n) {
		if (n == 1) {
			return;
		}
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				swap(arr, i, i + 1);
			}
		}
		recursivebubblesort(arr, n - 1);
	}

	public static void recursiveinsertionsort(int arr[], int n) {
		if (n == 1) {
			return;
		}
		recursiveinsertionsort(arr, n - 1);
		for (int i = n; i > 0; i--) {
			if (arr[i] < arr[i - 1]) {
				swap(arr, i, i - 1);
			} else {
				break;
			}
		}
	}

	public static void sortevenodd(int arr[]) {
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 != 0) {
				arr[i] *= -1;
			}
		}
		Arrays.sort(arr);
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 != 0) {
				arr[i] *= -1;
			}
		}
	}

	public static int[] merge(int one[], int two[]) {
		int out[] = new int[one.length + two.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				out[k] = one[i];
				i++;
				k++;
			} else {
				out[k] = two[j];
				j++;
				k++;
			}
		}
		while (i < one.length) {
			out[k] = one[i];
			i++;
			k++;
		}
		while (j < two.length) {
			out[k] = two[j];
			j++;
			k++;
		}
		return out;
	}

	public static int[] mergesord(int arr[], int l, int h) {
		if (l == h) {
			int[] ba = new int[1];
			ba[0] = arr[l];
			return ba;
		}
		int mid = (l + h) / 2;
		int one[] = mergesord(arr, l, mid);
		int two[] = mergesord(arr, mid + 1, h);
		return merge(one, two);
	}

	public static int partition(int arr[], int lo, int hi, int pivot) {
		int pidx = lo;
		int itr = lo;
		while (itr <= hi) { // jab tak itr ki journy khtm nahi ho jaati
			if (arr[itr] <= pivot) {
				swap(arr, itr, pidx);
				pidx++;
				itr++;
			} else {
				itr++;
			}
		}

		return pidx-1;
	}

	public static void qicksort(int arr[], int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int pivot = arr[hi];
		int pi = partition(arr, lo, hi, pivot);
		qicksort(arr, lo, pi - 1);
		lo = pi +1;
		//qicksort(arr, pi + 1, hi);
	}
	
	public static int part(int arr[],int low,int hi,int pivot){
		int pi = low;
		int itr = low;
		while(itr<=hi){
			if(arr[itr]<pivot){
				itr++;
				pi++;
				swap(arr, itr, pi);
			}
			else{
				itr++;
			}
			
		}
		return pi-1;
	}
}