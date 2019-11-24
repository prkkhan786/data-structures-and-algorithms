package aug19;

public class Rightleft {

	static int counter = 0;

	public static void main(String[] args) {
		// movedigonal(0, 0, 2, 2, "");
		movemorethanone(0, 0, 2, 2, "");
	}

	public static void moverightleft(int srow, int scol, int drow, int dcol, String bsf) {

		if (srow == drow && scol == dcol) {
			System.out.println(bsf);
			return;
		}

		if (srow < drow & scol < dcol) {
			moverightleft(srow + 1, scol, drow, dcol, bsf + "V");
			moverightleft(srow, scol + 1, drow, dcol, bsf + "H");
		} else if (srow < drow) {
			moverightleft(srow + 1, scol, drow, dcol, bsf + "V");
		} else if (scol < dcol) {
			moverightleft(srow, scol + 1, drow, dcol, bsf + "H");
		}

	}

	public static void movedigonal(int srow, int scol, int drow, int dcol, String bsf) {

		if (srow == drow && scol == dcol) {
			System.out.println(bsf + "" + counter);
			counter++;
			return;
		}

		if (srow < drow && scol < dcol) {
			for (int i = 1; i <= drow; i++) {
				movedigonal(srow + 1, scol, drow, dcol, bsf + "V");
				movedigonal(srow, scol + 1, drow, dcol, bsf + "H");
				movedigonal(srow + 1, scol + 1, drow, dcol, bsf + "D");
			}

		} else if (srow < drow) {
			movedigonal(srow + 1, scol, drow, dcol, bsf + "V");
		}

		else if (scol < dcol) {
			moverightleft(srow, scol + 1, drow, dcol, bsf + "H");
		}

	}

	public static void movemorethanone(int srow, int scol, int drow, int dcol, String bsf) {

		if (srow == drow && scol == dcol) {
 
			System.out.println(counter + "  " +bsf );
			counter++;
			return;
		}
		
			for (int i = 1; i <=drow-srow; i++) {
				movemorethanone(srow + i, scol, drow, dcol, bsf + "V" + i);
			}

		

		
			for (int i = 1; i<=dcol-scol; i++) {
				movemorethanone(srow, scol + i, drow, dcol, bsf + "H" + i);
			}

		
		
		
			for(int i=1;i<=drow-srow && i<=dcol-scol;i++){
				movemorethanone(srow+i, scol+i, drow, dcol, bsf + "H" + i);
				
			}
		
	}
	
}
