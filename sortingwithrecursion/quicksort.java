package sortingwithrecursion;
public class quicksort {
	public static void main(String[] args) {
		int arr[] = { 0, 11, 6, 8, 1, 7, 10 };
		quicksort(arr, 0, arr.length - 1);
		for(int val : arr){
			System.out.println(val+" ");
		}
	}
	public static void quicksort(int arr[], int low, int hi) {
		if (low == hi) {
			return;
		}
		int pivot = arr[hi];
		int pi = partition(arr, low, hi, pivot);
		quicksort(arr, low, pi - 1);
		quicksort(arr, pi + 1, hi);
	}
	public static int partition(int arr[], int low, int hi, int pivot) {
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
}