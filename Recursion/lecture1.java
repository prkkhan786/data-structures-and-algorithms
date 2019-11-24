package Recursion;

public class lecture1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toh("A", "B", "C", 3);
	}

	public static void printincreaing(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n + " ");
		printincreaing(n - 1);
	}

	public static void printdecreasing(int n) {
		if (n == 0) {
			return;
		}
		printdecreasing(n - 1);
		System.out.println(n);

	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		int f = n * fact(n - 1);
		return f;
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int p = n * power(x, n - 1);
		return p;

	}

	public static void toh(String src, String des, String help, int n) {
		if (n == 0) {
			return;
		}
		toh(src, help, des, n - 1);
		System.out.println("move disk " + n + "from" + src + " to " + des + " using " + help);
		toh(help, des, src, n - 1);
	}
}
