package aug28;

public class chesswithknight {

		static int counter = 1;
		public static void main(String[] args) {

			boolean[][] chess = new boolean[3][3];
			chesswithknight(chess, "", 1, 0);

		}

		public static void chesswithknight(boolean[][] chess, String asf, int qno, int lqps) {

			if (qno > chess.length) {
				if (isboardsafe(chess) == true) {
					System.out.println(asf+ " " + counter);
					counter++;
					return;
				}

			}

			for (int i = lqps + 1; i <= chess.length * chess.length; i++) {
				int r = (i - 1) / chess.length;
				int c = (i - 1) % chess.length;
				chess[r][c] = true;
				chesswithknight(chess, asf + r + "" + c + "" + " ", qno + 1, i);
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

			int[][] direction = { { -2, +1 }, { -1, +2 }, { +1, +2 }, { +2, +1 }, { +2, -1 }, { +1, -2 }, { -1, -2 }, { -2, -1 }

			};
			
				for (int dir = 0; dir < direction.length; dir++) {
					int rowenemy = row +  direction[dir][0];
					int colenemy = col +  direction[dir][1];

					if (rowenemy >= 0 && rowenemy < chess.length && colenemy < chess.length && colenemy >= 0) {
						if (chess[rowenemy][colenemy] == true) {
							return false;
						}

					}

				

			}

			return true;

		}

	}

