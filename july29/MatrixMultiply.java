package july29;

public class MatrixMultiply {

	public static void main(String[] args) {
		
		
		int [][] one = {
				{10,0,0},
				{1,2,3}
		};
		int [][] two = {
				{5,0,1,0},
				{10,0,0,10},
				{1,1,2,2}
		};
		

		multiply(one,two);
}
	
	public static void multiply(int[][] one , int[][] two){
		System.out.println("hello");
		
		int r1 = one.length;
		int c1 = one[0].length;
		int r2=two.length;
		int c2=two[0].length;
	
		
		if(c1==r2){
			
			//can be multiply
			int [][] product = new int[2][4]; 
			for(int r=0;r<product.length;r++){
				for(int col=0;col<product[0].length;col++){
					for(int k=0;k<r2;k++){
						product[r][col] = product[r][col] +  one[r][k]  * two[k][col];
						
					}
					
				}
			}
			
			display(product);
			
		}
		else{
			
			//cant be multiply
			System.out.println("Cant be multiply ");
			
			
			
			
		}
	}
	
public static void display(int arr[][]){
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j] + "\t");
				
			}
			System.out.println();
		}
	}

	
	
	
	
	
	

}
