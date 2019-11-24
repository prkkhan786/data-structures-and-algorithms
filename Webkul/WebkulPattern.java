package Webkul;

import java.util.LinkedList;

public class WebkulPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pattern1(5);
		patternmore(3);

	}

	public static void pattern(int n) {
		int nspace = 1;
		int star = 1;
		int nspace2 = 2;
		int nspace3 = 1;
		int space4 = 2;
		int space5 = 1;
		int space6 = 1;
		int row = 1;
		int sdoller = 2;
		int sdoller2 = 1;
		while (row <= n * 2 - 1) {
			for (int s = 1; s <= nspace; s++) {
				System.out.print("  ");
			}
			nspace--;
			for (int s = 1; s <= star; s++) {
				System.out.print(" * ");
			}
			star++;

			for (int s = 1; s <= nspace2; s++) {
				System.out.print("  ");
			}
			nspace2 -= 2;
			if (row == n - 2) {
				for (int i = 1; i <= sdoller; i++) {
					System.out.print("$ ");
				}
			}
			if (row == n - 2) {
				for (int i = 1; i <= sdoller2; i++) {
					System.out.print("$ ");
				}
			}

			for (int s = 1; s <= nspace3; s++) {
				System.out.print("  ");
			}
			for (int s = 1; s <= space4; s++) {
				System.out.print("  ");
			}
			for (int s = 1; s <= space5; s++) {
				System.out.print("  ");
			}

			for (int s = 1; s <= space6; s++) {
				System.out.print(" ");
			}

			System.out.println();
			row++;

		}
	}

	public static void pattern1(int n) {
		int i = 1;
		int nspace = n / 2;
		int nstar = 1;
		int space2 = 0;
		int ndoller = n;
		while (i <= 8) {
			if (i <= n / 2) {
				for (int j = 1; j <= nspace; j++) {
					System.out.print("  ");
				}
				for (int j = 1; j <= nstar; j++) {
					System.out.print("* ");
				}
				nspace--;
				nstar++;
			} else {
				for (int j = 1; j <= nspace; j++) {
					System.out.print("  ");
				}
				for (int j = 1; j <= nstar; j++) {
					System.out.print("* ");
				}
				nspace++;
				nstar--;
			}
			if (i >= n / 2 + 1) {
				if (i > n) {

				}
				// space
				for (int j = 1; j <= space2; j++) {
					System.out.print("  ");
				}
				space2 = n - 1;
				for (int j = 1; j <= ndoller; j++) {
					System.out.print("$ ");
				}
				ndoller = 1;
			}
			i++;
			System.out.println();
		}
	}

	public static void p(int n) {
		int firstline = n;
		int nspace1 = n / 2;
		int nstar = 1;
		int nspace2 = n / 2;
		for (int row = 1; row <= n + 2; row++) {
			if (row == 1) {
				int firstline1 = 1;
				while (firstline1 <= firstline) {
					System.out.print("@ ");
					firstline1++;
				}
			} else if (row == n + 2) {
				int space1 = 1;
				while (space1 <= nspace1) {
					System.out.print("  ");
					space1++;
				}
				int first = 1;
				while (first <= firstline) {
					System.out.print("@ ");
					first++;
				}
			} else {
				int space1 = 1;
				while (space1 <= nspace1) {
					System.out.print("  ");
					space1++;
				}
				int star = 1;
				while (star <= nstar) {
					System.out.print("* ");
					star++;
				}

				int space2 = 1;
				while (space2 <= nspace2) {
					System.out.print("  ");
					space2++;
				}
				if (row < (n / 2) + 2) {
					nstar++;
					nspace2--;
				} else {
					nstar--;
					space2++;
				}
			}
			System.out.println();
		}
	}

	public static void patternmore(int n) {
		int nspace1 = n;
		int nspace2 = n;
		int nstar1 = 1;
		int nhash = 0;
		int nstar2 = 0;
		for (int row = 1; row <= n; row++) {
			int space1 =1;
			while(space1<=nspace1){
				System.out.print(" ");
				space1++;
			}
			int star1= 1;
			while(star1<=nstar1){
				System.out.print("*");
				star1++;
			}
			int hash=1;
			while(hash<=nhash){
				System.out.print("-");
				hash++;
			}
			int star2=1;
			while(star2<=nstar2){
				System.out.print("*");
				star2++;
			}
			int space2=1;
			while(space2<=nspace2){
				System.out.print(" ");
				space2++;
			}
			if(row==1){
				nhash=1;
			}else
			{
				nhash+=2;
				nstar1++;
			}
			nspace1-=2;
			nstar2++;
			nspace2-=2;
			System.out.println();
		}
	}

}
