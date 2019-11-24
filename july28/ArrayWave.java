package july28;

import java.util.Scanner;

public class ArrayWave {

	public static void main(String[] args) {
		
		int arr[][] = takeinput();
		display(arr);
		
			
	}

	
	public static int[][] takeinput(){
		Scanner src = new Scanner(System.in);
		System.out.println("enter the row");
		int rows = src.nextInt();
		System.out.println("enter columb");
		int columns = src.nextInt();
		int arr[][] = new int[rows][columns];
		
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[0].length;col++){
				System.out.println("Enter the value of " + row + " and " + col );
				arr[row][col] = src.nextInt();
			}
		}
		
		
		return arr;
		
	}
	
public static void display(int arr[][]){
		
		for(int i=0;i<arr[0].length;i++){
			{
				if(i%2==0){
					for(int j=0;j<arr.length;j++)
					System.out.print(arr[j][i]+ " ");
				}
				else{
					for(int j=arr.length-1;j>=0;j--)
					System.out.print(arr[j][i]+ " ");
					
				}
				
				
			}
			System.out.println();
		}
	}
}
