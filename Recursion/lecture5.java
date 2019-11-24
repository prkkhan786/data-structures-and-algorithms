package Recursion;

public class lecture5 {

	public static void main(String[] args) {
		pbpwithoneandsix(0, 10, "");
	}

	static int counter = 0;

	public static void pbp(int src, int des, String psf) {

		if (src == des) {
			counter++;
			System.out.println(psf + " " + counter);
			return;
		}
		if (src > des) { // reactive basecase recovered from a nad call
			return;
		}
		for (int dice = 1; dice <= 6; dice++) {
			int intermediate = src + dice;
			pbp(intermediate, des, psf + dice);
		}
	}

	public static void proactivepbp(int src, int des, String psf) {

		if (src == des) {
			counter++;
			System.out.println(psf + " " + counter);
			return;
		}
		for (int dice = 1; dice <= 6; dice++) {
			int intermediate = src + dice;
			if (intermediate <= des) {
				proactivepbp(intermediate, des, psf + dice);
			}

		}
	}

	public static void pbpwithoneandsix(int src, int des, String psf) {
		if (src == des) {
			counter++;
			System.out.println(psf + " " + counter);
			return;
		}
		if (src > des) { // reactive basecase recovered from a nad call
			return;
		}
		if (src == 0) {
			pbpwithoneandsix(1, des, psf + 1);
			pbpwithoneandsix(1, des, psf + 6);

		} else {
			for (int dice = 1; dice <= 6; dice++) {
				int intermediate = src + dice;
				pbpwithoneandsix(intermediate, des, psf + dice);
			}
		}

	}
}
