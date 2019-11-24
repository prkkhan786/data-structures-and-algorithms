package nov11;
import java.util.ArrayList;
public class bellmanford {
	private static class edge {
		int u;
		int v;
		int wt;

		public edge(int u, int v, int wt) {
			this.u = u;
			this.v = v;
			this.wt = wt;
		}
	}
	public static void main(String[] args) {
		Integer[][] graph = new Integer[4][4];
		graph[0][1] = 2;
		graph[1][3] = 5;
		graph[2][3] = 1;
		graph[0][2] = 4;
		graph[3][2] = 2;
		graph[3][1] = -6;
		balmanford(graph, 0);
	}
	public static void balmanford(Integer[][] graph, int src) {
		ArrayList<edge> edges = new ArrayList<>();
		for (int u = 0; u < graph.length; u++) {
			for (int v = 0; v < graph[0].length; v++) {
				if (graph[u][v] != null) {
					edge e = new edge(u, v, graph[u][v]);
					edges.add(e);
				}
			}
		}
		Integer[] res = new Integer[graph.length];
		res[0] = 0;
		for (int i = 1; i <= graph.length - 1; i++) {
			for (edge e : edges) {
				if (res[e.u] != null) {
					if (res[e.v] == null || res[e.u] + e.wt < res[e.v]) {
						res[e.v] = res[e.u] + e.wt;
					}
				}
			}
		}
		// negitive cycle
		for (int i = 1; i <= graph.length - 1; i++) {
			for (edge e : edges) {
				if (res[e.u] != null) {
					if (res[e.v] == null || res[e.u] + e.wt < res[e.v]) {
						res[e.v] = res[e.u] + e.wt;
						System.out.println("negiive cycle");
						return;
					}
				}
			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i] + " ");
		}
	}
}
