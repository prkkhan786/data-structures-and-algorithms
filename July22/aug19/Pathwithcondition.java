package aug19;

public class Pathwithcondition {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		arr[0][1] = 1;
		arr[0][2] = 1;
		arr[0][3] = 1;
		arr[2][1] = 1;
		arr[2][2] = 1;
		arr[2][4] = 1;
		arr[3][4] = 1;
		arr[4][1] = 1;
		arr[4][2] = 1;
		boolean[][] visited = new boolean[5][5];
		thunder(arr, 0, 0, visited, "");
	}
	

	public static void moverightleft(int[][] condition, int sr, int sc, boolean[][] visited, String bsf) {
		if (sr == condition.length - 1 && sc == condition[0].length - 1) {
			System.out.println(bsf);
			return;

		}

		visited[sr][sc] = true;
		if (sr - 1 >= 0 && condition[sr - 1][sc] != 1 && visited[sr - 1][sc] == false) {
			moverightleft(condition, sr - 1, sc, visited, bsf + "Top"+ " ->");
		}
		if (sc + 1 <= condition[0].length - 1 && condition[sr][sc + 1] != 1 && visited[sr][sc + 1] == false) {
			moverightleft(condition, sr, sc + 1, visited, bsf + "right"+ " ->");
		}
		if (sr + 1 <= condition.length - 1 && condition[sr + 1][sc] != 1 && visited[sr + 1][sc] == false) {
			moverightleft(condition, sr + 1, sc, visited, bsf + "bottom"+ "->");
		}
		if (sc - 1 >= 0 && condition[sr][sc - 1] != 1 && visited[sr][sc - 1] == false) {
			moverightleft(condition, sr, sc - 1, visited, bsf + "left"+ "->");
		}
		visited[sr][sc] = false;

	}
	
	public static void thunder(int [][] condition,int sr,int sc,boolean [][] visted ,String bsf){
		if(sr==condition.length-1 && sc==condition[0].length-1){
			System.out.println(bsf);
			return;
		}
		
		

		if(wrongplace(condition,sr,sc,visted) == false){
			return;
		}
		visted[sr][sc] = true;
		thunder(condition, sr-1, sc, visted,bsf+"t");
		thunder(condition, sr, sc+1, visted,bsf+"r");
		thunder(condition, sr+1, sc, visted,bsf+"b");
		thunder(condition, sr, sc-1, visted,bsf+"l");
		visted[sr][sc]= false;
		
		
	}
	
	public static boolean wrongplace(int [][] condition,int sr,int sc,boolean [][] visted ){
		
		if(sr<0 || sc<0 || sr> condition.length || sc>condition.length )
			return true;
		else if(condition[sr][sc] == 0){
			return true;
		}
		else if(visted[sr][sc] == false){
			return true;
		}
		else {
			return false;
		}
	}
}
