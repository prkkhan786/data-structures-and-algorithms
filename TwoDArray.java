import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int arr[][] = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		spiraldisplay(arr);
	}

	public static void wavedisplay(int arr[][]) {
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {

				for (int row = 0; row < arr.length; row++) {
					System.out.println(arr[row][col]);
				}
			} else {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.println(arr[row][col]);
				}
			}
		}

	}

	public static void spiraldisplay(int arr[][]) {
		int rmin = 0;
		int cmin = 0;
		int rmax = arr.length-1;
		int cmax = arr[0].length-1;

		int cnt = 1;
		int tnofelemets = arr.length * arr[0].length;

		while (cnt <= tnofelemets) {

			// left

			for (int row = rmin; row <= rmax; row++) {
				System.out.println(arr[row][cmin]);
				cnt++;
			}
			cmin++;

			// bottom wall

			for (int col = cmin; col <=cmax; col++) {
				System.out.println(arr[rmax][col]);
				cnt++;
			}
			rmax--;

			/// right

			for (int row = rmax; row >= rmin; row--) {
				System.out.println(arr[row][cmax]);
				cnt++;
			}
			cmax--;

			// top
			for (int col = cmax; col >= cmin; col--) {
				System.out.println(arr[rmin][col]);
				cnt++;
			}
			rmin--;
		}

	}

}
