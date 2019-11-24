package Pep10janGraphs;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class graphs {

	static int spd;
	static String sp;
	static String lp;
	static int lpd;
	static int fw;
	static int fpd;
	static String fp;
	static int cpd;
	static String cp;

	static PriorityQueue<pair> p;

	static Integer[][] graph = new Integer[7][7];
	static boolean visted[] = new boolean[7];

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		addEdge(graph, 0, 1, 10);
		addEdge(graph, 1, 2, 10);
		addEdge(graph, 2, 3, 10);
		addEdge(graph, 0, 3, 40);
		addEdge(graph, 3, 4, 40);
		addEdge(graph, 4, 5, 3);
		addEdge(graph, 5, 6, 3);
		addEdge(graph, 4, 6, 8);
		addEdge(graph, 2, 5, 10);
		// p = new PriorityQueue<>(Collections.reverseOrder());
		// sp = "";
		// spd = Integer.MAX_VALUE;
		// lp = "";
		// lpd = Integer.MIN_VALUE;
		// sp = "";
		// spd = Integer.MAX_VALUE;
		// fpd = Integer.MIN_VALUE;
		// fp = "";
		// multisolver(0, 6, "", 0, 50, 45, 3);
		// hamiltonPath(0, 0, 0, "");
		int board[][] = new int[5][5];
		knight(board, 5, 0, 0, 0);
	}

	public static void multisolver(int s, int d, String psf, int dsf, int cw, int fw, int k) {
		if (s == d) {

			if (p.isEmpty() && dsf < spd) {
				p.add(new pair(dsf, psf));
				return;
			} else {
				if (dsf < p.peek().data) {
					p.remove();
					p.add(new pair(dsf, psf));
				}
			}

			//

			if (dsf < spd) {
				spd = dsf;
				sp = psf;
			}
			if (dsf > lpd) {
				lpd = dsf;
				lp = psf;
			}
			if (dsf > cw && dsf < cpd) {
				cpd = dsf;
				cp = psf;
			}
			if (dsf < fw && dsf > fpd) {
				fw = dsf;
				fp = psf;
			}

			System.out.println(psf + "" + d);
			System.out.println(fp);
			return;

			//
		}
		visted[s] = true;
		for (int i = 0; i < graph.length; i++) {
			if (graph[s][i] != null && visted[i] == false) {
				multisolver(i, d, psf + s, dsf + graph[s][i], cw, fw, k);
			}
		}
		visted[s] = false;
	}

	public static class pair implements Comparable<pair> {

		int data;
		String path;

		public pair(int data, String path) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.path = path;
		}

		@Override
		public int compareTo(pair o) {
			return this.data - o.data;
		}
	}

	private static void addEdge(Integer[][] graph, int u, int v, int wt) 
	
	 {
		graph[u][v] = wt;
		graph[v][u] = wt;
	}

	public static boolean haspath(Integer[][] graph, Boolean[] visted, int u, int v) {
		if (u == v) {
			return true;
		}
		visted[u] = true;
		for (int i = 0; i < graph.length; i++) {
			if (graph[u][i] != null && visted[i] == false) {
				boolean hpsf = haspath(graph, visted, i, v);
				if (hpsf == true) {
					return true;
				}
			}
		}
		return false;
	}

	public static void hamiltonPath(int src, int os, int counter, String psf) {
		if (counter == graph.length - 1) {
			System.out.println(psf + src);
			if (graph[src][os] != null) {
				System.out.println(psf + src + "*");
			}
			return;

		}
		visted[src] = true;
		for (int i = 0; i < graph.length; i++) {
			if (graph[src][i] != null && visted[i] == false) {
				hamiltonPath(i, os, counter + 1, psf + src);
			}

		}
		visted[src] = false;
	}

	public static void knight(int arr[][], int n, int r, int col, int counter) 
	{
		
		knight(arr, n, r+1, col+2, counter+1);
		knight(arr, n, r+2, col+1, counter+1);
		knight(arr, n, r+2, col+1, counter+1);
		knight(arr, n, r+1, col+2, counter+1);
		knight(arr, n, r+2, col+1, counter+1);
		knight(arr, n, r+2, col+1, counter+1);
		knight(arr, n, r+2, col+1, counter+1);
		
		
	}

}
