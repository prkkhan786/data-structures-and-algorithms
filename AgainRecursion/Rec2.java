package AgainRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import Again.Again;

public class Rec2 {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 4, 8, 9, 6, 9, 3, 26 };
		bubbleSortWithRecursion(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void displayarray(int arr[], int vidx) {
		if (vidx == arr.length) {
			return;
		}
		System.out.println(arr[vidx]);
		displayarray(arr, vidx + 1);

	}

	public static void displayarrayinReverse(int arr[], int vidx) {
		if (vidx == arr.length) {
			return;
		}

		displayarrayinReverse(arr, vidx + 1);
		System.out.println(arr[vidx]);

	}

	public static int largestElement(int arr[], int vidx) {
		if (vidx == arr.length) {
			return arr[vidx - 1];
		}
		int max = largestElement(arr, vidx + 1);
		if (max < arr[vidx]) {
			max = arr[vidx];
		}
		return max;
	}

	public static boolean findelementinarray(int arr[], int vidx, int data) {
		if (vidx == arr.length) {
			return false;
		}
		boolean in = findelementinarray(arr, vidx + 1, data);
		if (in) {
			return true;
		} else {
			if (arr[vidx] == data) {
				return true;
			} else {
				return false;
			}
		}

	}

	public static int indexatfirst(int arr[], int vidx, int data) {
		if (vidx == arr.length) {
			return vidx - 1;
		}

		if (arr[vidx] == data) {
			return vidx;
		} else {
			int f = indexatfirst(arr, vidx + 1, data);
			return f;
		}

	}

	public static int lastindex(int arr[], int vidx, int data) {
		if (vidx == arr.length) {
			return -1;
		}
		int l = lastindex(arr, vidx + 1, data);
		if (l != -1) {
			return -1;
		} else {
			if (arr[vidx] == data) {
				return vidx;
			} else {
				return -1;
			}
		}
	}

	public static int[] allindices(int arr[], int vidx, int data, int csf) {
		if (vidx == arr.length) {
			return new int[csf];
		}
		int res[] = null;
		if (arr[vidx] == data) {
			res = allindices(arr, vidx + 1, data, csf + 1);
			res[csf] = vidx;
		} else {
			res = allindices(arr, vidx + 1, data, csf);
		}
		return res;
	}

	public static ArrayList<Integer> allindiceswitharraylist(int arr[], int vidx, int data, int csf) {
		if (vidx == arr.length) {
			return new ArrayList<>();
		}
		ArrayList<Integer> res = null;
		if (arr[vidx] == data) {
			res = allindiceswitharraylist(arr, vidx + 1, data, csf + 1);
			res.add(vidx);
		} else {
			res = allindiceswitharraylist(arr, vidx + 1, data, csf);
		}
		return res;
	}

	public static void bubbleSortWithRecursion(int arr[], int si, int ei) {
		if (ei == 0) {
			return;
		}
		if (si == ei) {
			bubbleSortWithRecursion(arr, 0, ei - 1);
			return;
		}
		if (arr[si] > arr[si + 1]) {
			Again.swap(arr, si, si + 1);
		}
		bubbleSortWithRecursion(arr, si + 1, ei);
	}
}