package Home;

import java.util.HashMap;
import java.util.Map;

public class Hashmappp {
	public static void main(String[] args) {
		boolean box[] = new boolean[4];
		combination(1, box, 2, "", 4, -1);
	}

	public static void box(int qno, boolean box[], int tnoq, String asf, int tnob) {
		if (qno > tnoq) {
			System.out.println(asf);
			return;
		}
		for (int i = 0; i < tnob; i++) {

			if (box[i] == false) {
				box[i] = true;
				box(qno + 1, box, tnoq, asf + "q" + qno + "box" + i, tnob);
				box[i] = false;
			}
		}
	}

	
	public static void combination(int qno, boolean box[], int tnoq, String asf, int tnob,int lqpb) {
		if (qno > tnoq) {
			System.out.println(asf);
			return;
		}
		for (int i = lqpb+1; i < tnob; i++) {
			if (box[i] == false) {
				box[i] = true;
				combination(qno + 1, box, tnoq, asf + "q" + qno + "box" + i, tnob,i);
				box[i] = false;
			}
		}
	}
}
