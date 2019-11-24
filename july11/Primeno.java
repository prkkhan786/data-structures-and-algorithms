package july11;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = src.nextInt();
		int i = 2;

		while (i * i <= n) {

			if (n % i == 0) {
				System.out.println(" is not prime");
				return;
			}

			i++;

		}
		if (i * i >= n)

			System.out.println("is prime");

	}
	

}
