package nov11;
import java.util.HashSet;
import java.util.LinkedList;
import binarytreee.BinaryTreep.isbst;
public class Topologicalsort {
	public static void main(String args[])
	{
		boolean [][] graph = new boolean[7][7];
		graph[0][1] = true;
		graph[0][3] = true;
		graph[1][2] = true;
		graph[2][3] = true;
		graph[4][3] = true;
		graph[4][5] = true;
		graph[5][6] = true;
		graph[6][2] = true;
		HashSet<Integer> visited = new HashSet<>();
		LinkedList<Integer> result = new LinkedList<>();
		for(int vertx=0;vertx<graph.length;vertx++)
		{
			if(!visited.contains(vertx))
			{
				topologicalSort(graph, visited, vertx, result);
			}
		}	
		System.out.println(result);
	}
	public static void topologicalSort(boolean [][] graph,HashSet<Integer> visited, int src,LinkedList<Integer> result)
	{
		visited.add(src);
		for(int v=0;v<graph.length;v++)
		{
			if(graph[src][v]==true && visited.contains(v)==false)
			{
				topologicalSort(graph, visited, v, result);
			}
		}
		result.addFirst(src);
	}
		
}