package july14;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = src.nextInt();

		int r = 1;
		int nstar = 1;
		int nspace = n / 2;
		int val = 1;

		while (r <= n) {
			for (int i = 0; i <= nspace - 1; i++) {
				System.out.print("  ");

			}
			if (r <= n / 2)
				nspace--;
			else
				nspace++;
			val = r <= n / 2 ? r : n + 1 - r; // row start hote hi val assign kr
												// do
			for (int b = 1; b <= nstar; b++) {

				System.out.print(val + " ");
				val = b <= nstar / 2 ? val + 1 : val - 1;
			}
			if (r <= n / 2)
				nstar = nstar + 2;
			else
				nstar -= 2;

			System.out.println();
			r++;

		}

	}

}
