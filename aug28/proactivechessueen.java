package aug28;

public class proactivechessueen {
	static int counter = 0;

	public static void main(String[] args) {
		
		boolean[][] chess = new boolean[4][4];
		chesswithqueenboxpro(chess, "", 1,1);

	}

	public static void chesswithqueenboxpro(boolean[][] chess, String asf, int qno,int boxn) {

		if (qno > chess.length) {
			
				System.out.println(asf + " " + counter);
				counter++;
				return;
			}
			
			if(boxn>chess.length * chess.length){
				return;
			}

		

		// box says no
			chesswithqueenboxpro(chess, asf, qno, boxn + 1);
			int r = (boxn - 1)/chess.length;
			int c = (boxn - 1)%chess.length;
					
			if(isQueensafe(chess, r, c))
			{
				chess[r][c] = true;
				chesswithqueenboxpro(chess, asf + r + c + " ", qno + 1, boxn+1);
				chess[r][c] = false;
			}

	}

	public static boolean isboardsafe(boolean[][] chess) {

		for (int row = 0; row < chess.length; row++) {
			for (int col = 0; col < chess.length; col++) {
				if (chess[row][col] == true) {
					if (isQueensafe(chess, row, col) == false) {
						return false;
					}

				}

			}
		}
		return true;
	}
	public static boolean isQueensafe(boolean[][] chess, int row, int col) {
		int[][] direction = { { -1, 0 }, { -1, +1 }, { 0, +1 }, { +1, +1 }, { +1, 0 }, { +1, -1 }, { 0, -1 }, { -1, -1 }
		};
		for (int i = 1; i < chess.length; i++) {
			for (int dir = 0; dir < direction.length; dir++) {
				int rowenemy = row + i * direction[dir][0];
				int colenemy = col + i * direction[dir][1];

				if (rowenemy >= 0 && rowenemy < chess.length && colenemy < chess.length && colenemy >= 0) {
					if (chess[rowenemy][colenemy] == true) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
