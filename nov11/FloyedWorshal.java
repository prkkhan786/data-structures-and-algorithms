package nov11;

public class FloyedWorshal {

	public static void main(String[] args) {
		Integer [][] graph = new Integer[4][4];
		graph[0][1] = 4;
		graph[0][2] = 10;
		graph[0][3] = 3;
		graph[1][3] = 2;
		graph[1][3] = 3;
		graph[3][1] = 1;
		graph[3][2] = 2;		
		
		graph[0][0]=0;
		graph[1][1]=0;
		graph[2][2]=0;
		graph[3][3]=0;
		
		
				Floyd(graph);
				
				for(int i=0;i<graph.length;i++){
					for(int d=0;d<graph.length;d++){
						System.out.print(graph[i][d]+ " ");
					}
					System.out.println();
			}
	}
	private static void Floyd(Integer[][] graph) {
		for(int i=0;i<graph.length;i++){
			for(int s=0;s<graph.length;s++){
				for(int d=0;d<graph.length;d++){
					if(i==s || i==d){
						continue;
					}
					else if(graph[s][i]==null || graph[i][d]==null){
						continue;
					}else if(graph[s][d]==null || graph[s][i]+graph[i][d]<graph[s][d]){
						graph[s][d] = graph[s][i]+graph[i][d];
					}
				}
			}
		}
		
	}

}
