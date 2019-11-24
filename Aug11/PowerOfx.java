package Aug11;

import java.lang.reflect.Array;

public class PowerOfx {
	public static void main(String[] args) {
		System.out.println(fibonacci(6));
		int arr[] = { 4, 5, 6, 6, 8, 7, 10 };
		// Arrayprintreverse(arr, 0);
		// boolean a=find(arr, 0, 7);
		// if(a==true){
		// System.out.println("found");
		// }
		// else{
		// System.out.println("not found");
		// }
		System.out.println(lastIndex(arr, 0, 6));
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int p = n * power(x, n - 1);
		return p;
	}

	public static int smartpower(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int p = smartpower(x, n / 2);
		int f = p * p;
		if (n % 2 == 1) {
			f = p * p * x;
		}
		return f;
	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return n;
		}
		if (n == 1) {
			return n;
		}
		int fib = fibonacci(n - 1);
		int fib2 = fibonacci(n - 2);

		int f = fib + fib2;
		return f;

	}

	public static void Arrayprint(int arr[], int vidx) {
		if (vidx == arr.length) {
			return;
		}
		System.out.println(arr[vidx]);
		Arrayprint(arr, vidx + 1);
	}

	public static void Arrayprintreverse(int arr[], int vidx) {
		if (vidx == arr.length) {
			return;
		}

		Arrayprintreverse(arr, vidx + 1);
		System.out.println(arr[vidx]);
	}

	// 4, 5, 6, 8, 7
	public static int Max(int arr[], int vidx) {
		if (vidx == arr.length - 1) {
			int maxx = arr.length - 1;
			return arr[maxx];
		}
		int cmax = Max(arr, vidx + 1);
		if (cmax < arr[vidx]) {
			cmax = arr[vidx];
		}

		return cmax;
	}

	public static boolean find(int arr[], int vidx, int data) {
		if (vidx == arr.length) {
			return false;
		}

		if (arr[vidx] == data) {
			return true;
		}
		boolean f = find(arr, vidx + 1, data);
		if (f == true) {
			return true;
		} else {
			return false;
		}
	}

	public static int firstIndex(int arr[], int vidx, int data) { // 4, 5, 6, 8,
																	// 7,10 //8
		if (arr[vidx] == data) {
			return vidx;
		} else {
			int v = firstIndex(arr, vidx + 1, data);
			return v;
		}
	}

	public static int lastIndex(int arr[], int vidx, int data) { // 4, 5, 6, 8,
																	// 7,10 //8
		if (vidx == arr.length) {
			return -1;
		}
		int v = lastIndex(arr, vidx + 1, data);
		if (v != -1) {
			return v;
		}
		if (arr[vidx] == data) {
			return vidx;
		} else {
			return -1;
		}

	}

}
