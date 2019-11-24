package Recursion;

public class lecture2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String src = "abdg";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < src.length()-1; i++) {
			char ch = src.charAt(i);
			char nch = src.charAt(i + 1);
			int asci = (int)(nch) - (int)(ch);
			System.out.println(asci);
			sb.append(ch);
			sb.append(asci);
		}
		sb.append(src.charAt(src.length()-1));
		System.out.println(sb);
	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int f1 = fib(n - 1);
		int f2 = fib(n - 2);
		int sum = f1 + f2;
		return sum;
	}

	public static void displayarray(int arr[], int n) {
		if (n == arr.length) {
			return;
		}
		System.out.println(arr[n]);
		displayarray(arr, n + 1);
		System.out.println(arr[n]);
	}

	public static int largestelementinarray(int arr[], int vidx) {
		if (vidx == arr.length) {
			return arr[arr.length - 1];
		}
		int lsf = largestelementinarray(arr, vidx + 1);
		if (lsf < arr[vidx]) {
			lsf = arr[vidx];
		}
		return lsf;
	}

	public static boolean findx(int arr[], int vidx, int data) {
		if (vidx == arr.length) {
			return false;
		}
		if (arr[vidx] == data) {
			return true;
		}
		boolean isf = findx(arr, vidx + 1, data);
		if (isf) {
			return true;
		} else
			return false;

	}

	public static int index(int arr[], int vidx, int data) {
		if (arr[vidx] == data) {
			return vidx;
		} else {
			int i = index(arr, vidx + 1, data);
			return i;
		}
	}

	public static int lastindex(int arr[], int vidx, int data) {
		if (vidx == arr.length) {
			return -1;
		}
		int li = lastindex(arr, vidx + 1, data);
		if (li != -1) {
			return li;
		}
		if (arr[vidx] == data) {
			return vidx;
		} else {
			return -1;
		}
	}

	public static int[] allindices(int arr[], int vidx, int data, int csf) {
		if (arr.length == 0) {
			int re[] = new int[csf];
			return re;
		}
		int res[] = null;
		if (arr[vidx] == data) {
			res = allindices(arr, vidx + 1, data, csf + 1);
			res[csf] = vidx;

		} else
			res = allindices(arr, vidx + 1, data, csf);
		return res;
	}
}
