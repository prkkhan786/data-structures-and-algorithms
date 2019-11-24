package newyear;

public class Newyear {
	public static void main(String args[]) {
		patter10(5);
	}

	public static void prime(int n) {
		int i = 2;
		while (i * i < n) {
			if (n % i == 0) {
				System.out.println("not prime");
				return;
			}
			i++;
		}
		System.out.println("prime");
	}

	public static void allprime(int n) {
		int cn = 2;
		while (cn <= n) {
			int div = 2;
			while (div * div < cn) {
				if (cn % div == 0) {
					break;

				}
				div++;
			}
			if (div * div > cn) {
				System.out.println(cn);
			}
			cn++;
		}
	}

	public static void fib(int n) {
		int a = 0;
		int b = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
		}
	}

	public static void reverseno(int n) {
		int newno = 0;
		while (n != 0) {
			int digit = n % 10;
			n = n / 10;
			newno = (newno * 10) + digit;

		}
		System.out.println(newno);
	}

	public static void gcd(int a, int b) {
		int rem = b % a;
		while (rem != 0) {
			b = a;
			a = rem;
			rem = b % a;
			System.out.println(a); // jisne last bar divide kiya hgoga
		}
	}

	public static void pattern1(int n) {
		int row = 1;
		int a = 0;
		int b = 1;
		while (row <= n) {
			int col = 1;
			while (col <= row) {
				System.out.print(a + " ");
				int c = a + b;
				a = b;
				b = c;
				col++;
			}
			System.out.println();
			row++;
		}
	}

	public static void pattern4(int n) {
		int row = 0;
		while (row < n) {
			int val = 1;
			int col = 0;
			while (col <= row) {
				System.out.print(val + " ");
				int newval = val * (row - col) / (col + 1);
				val = newval;
				col++;
			}
			System.out.println();
			row++;
		}
	}

	public static void pattern5(int n) {
		int row = 1;
		while (row <= n) {
			int col = 1;
			while (col <= n) {
				if (row == col || row + col == n + 1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
				col++;
			}
			System.out.println();
			row++;
		}
	}

	public static void pattern6(int n) {
		int row = 1;
		int nstar = n / 2 + 1;
		int space = 1;
		while (row <= n) {
			int ctar = 1;
			while (ctar <= nstar) {
				System.out.print("* ");
				ctar++;
			}

			int cspace = 1;
			while (cspace <= space) {
				System.out.print("  ");
				cspace++;
			}
			int ctar1 = 1;
			while (ctar1 <= nstar) {
				System.out.print("* ");
				ctar1++;
			}

			if (row <= n / 2) {
				nstar--;
				space += 2;

			} else {
				nstar++;
				space -= 2;
			}
			System.out.println();
			row++;
		}
	}

	public static void pattern(int n) {
		int row = 1;
		int nstar = 1;
		int spaces = n - 1;
		while (row <= n) {
			//
			for (int spa = 1; spa <= spaces; spa++) {
				System.out.print("  ");
			}
			for (int star = 1; star <= nstar; star++) {
				System.out.print("* ");
			}

			for (int spa = 1; spa <= spaces; spa++) {
				System.out.print("  ");
			}

			nstar += 2;
			spaces -= 1;
			System.out.println();
			row++;
		}
	}

	public static void patter10(int n) {
		int nstar = 1;
		int nspace = n + 1;
		int row = 1;
		while (row <= n) {
			int counter = 1;
			
			
			if(row==n){
				int c=1;
				while(c<n*2){
					System.out.print(counter+++" ");
					c++;
				}
			}else{
				// star
				for (int star = 1; star <=nstar; star++) {
					System.out.print(counter+++" ");
				}
				// space
				for (int space = 1; space <= nspace; space++) {
					System.out.print("  ");
				}

				// star
				for (int star = 1; star <= nstar; star++) {
					System.out.print(counter+++" ");
				}
				if(row<n){
					nstar++;
					nspace -= 2;
				}
			}
			
			System.out.println();
			row++;
		}
	}
}
