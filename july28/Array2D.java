package july28;

public class Array2D {

	public static void main(String[] args) {
			
		int arr [][]  = new int[2][3];
		
		arr = new int[][]{
			 
					
					{1,2,3},
					{4,5,6},
					
					
					};
		display(arr);
		

	}
	
	public static void display(int arr[][]){
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
	}

	
	
}
