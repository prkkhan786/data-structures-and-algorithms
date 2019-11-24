package aug05;

public class Decreasing {

	public static void main(String[] args) {
		// decrease(5);
		skip(8);
	}

	public static void decrease(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		decrease(n - 1);

	}

	public static void increase(int n) {
		if (n == 0) {
			return;
		}

		increase(n - 1);
		System.out.println(n);

	}

	public static void increasedecrease(int n) {
		if (n == 0) {

		}
		System.out.println(n);
		increasedecrease(n - 1);
		System.out.println(n);

	}

	public static void skip(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 == 1) {
			System.out.println(n);
		}
		skip(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);
		}
	}
}
