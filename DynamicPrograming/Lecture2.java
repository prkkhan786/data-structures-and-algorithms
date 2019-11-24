package DynamicPrograming;

public class Lecture2 {

	public static void main(String[] args) {
		//System.out.println(finusingtabulation(5));
		/// Tabulisation
		/// bottom up approach
		System.out.println(boardpathMemoized(0, 10,new int[11]));
	}
	public static int finusingtabulation(int n){
		int arr[] = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2;i<=n;i++){
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n];
	}
	
	public static int boardpath(int src, int des)
	{
		if(src>des){
			return 0;
		}
		if(src==des){
			return 1;
			//dice pheko hi mat 
		}
		int cfstod =  0;
		for(int dice = 1;dice<=6;dice++){
			int cfntertod = boardpath(src+dice,des); // intermediate se des ke raaste aa rhe h 
			cfstod+=cfntertod;
		}
		return cfstod;
	}
	
	public static int boardpathMemoized(int src, int des,int qb[]){
		if(src>des){
			return 0;
		}
		if(src==des){
			return 1;
			//dice pheko hi mat 
		}
		
		if(qb[src]!=0){
			return qb[src];
		}
		int cfstod =  0;
		for(int dice = 1;dice<=6;dice++){
			int cfntertod = boardpathMemoized(src+dice,des,qb); // intermediate se des ke raaste aa rhe h 
			cfstod+=cfntertod;
		}
		qb[src] = cfstod;
		return cfstod;
	}
	
}