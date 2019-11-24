package constilation;

import java.util.LinkedList;
import java.util.Queue;

public class NoOfConstellations {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 1, 1, 0, 0 }, { 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 0 }, { 0, 1, 0, 1, 0 } };
		System.out.println(NoOfConstellations(arr));

	}

	public static int NoOfConstellations(int[][] arr) {
		int no = 0;
		boolean[][] visited = new boolean[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (!visited[i][j] && arr[i][j] == 1) {
					bfs(arr, i, j, visited); // make all connected path of i and
												// j visited
					no++;
				}
			}
		}
		return no;
	}
	
	
	
	public static void bfs(int[][] arr, int i, int j, boolean[][] visited) {
		LinkedList<int[]> q = new LinkedList<int[]>();
		int[] base = { i, j };
		q.addLast(base);
		visited[i][j] = true;
		while (!q.isEmpty()) {
			int[] ele = q.removeFirst();
			int a = ele[0];
			int b = ele[1];
			if (a - 1 >= 0 && arr[a - 1][b] == 1 && (!visited[a - 1][b])) {
				q.addLast(new int[] { a - 1, b });
				visited[a - 1][b] = true;
			}
			if (b - 1 >= 0 && arr[a][b - 1] == 1 && (!visited[a][b - 1])) {
				q.addLast(new int[] { a, b - 1 });
				visited[a][b - 1] = true;
			}
			if (a + 1 < arr.length && arr[a + 1][b] == 1 && (!visited[a + 1][b])) {
				visited[a + 1][b] = true;
				q.addLast(new int[] { a + 1, b });
			}
			if (b + 1 < arr[0].length && arr[a][b + 1] == 1 && (!visited[a][b + 1])) {
				q.addLast(new int[] { a, b + 1 });
				visited[a][b + 1] = true;
			}
		}
	}

}
