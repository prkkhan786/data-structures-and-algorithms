package ArraySorting;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 15, 2, -1, 7 };
		// recursiveBubbleSort(arr, 0, arr.length - 1);
		selectionsort(arr);
		for (int val : arr) {
			System.out.println(val);
		}

	}

	public static void bubblesort(int arr[]) {

		int n = arr.length - 1;
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j < n - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	public static void optimizedbubblesort(int arr[]) {
		int n = arr.length - 1;
		boolean iswap = false;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i; i = j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					iswap = true;
				}
			}
			if (iswap) {
				break;
			}
		}
	}

	public static void recursiveBubbleSort(int arr[], int si, int ei) {
		if (ei == 0) {
			return;
		}
		if (si == ei) {
			recursiveBubbleSort(arr, 0, ei - 1);
			return;
		}

		if (arr[si] > arr[si + 1]) {
			swap(arr, si, si + 1);
		}
		recursiveBubbleSort(arr, si + 1, ei);

	}

	public static void selectionsort(int arr[]) {
		int n = arr.length - 1;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

	public static void insertionsort(int arr[]) {
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

	public static void swap(int arr[], int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
