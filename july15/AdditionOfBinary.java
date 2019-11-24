package july15;

import java.util.Scanner;

public class AdditionOfBinary {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = src.nextInt();
		int m = src.nextInt();
		int c = 0;
		int r1 = n % 10;
		int r2 = m % 10;
		int sum = 0;
		while (n != 0 && m != 0) {
			sum = r1 + r2 + c;
		}
		System.out.println(sum);

	}

}
