package july28;

import java.util.Scanner;

public class Rotate90Array {

	public static void main(String[] args) {
		int arr[][] = {
				{1,2,3},
				{4,5,6}, 
				{7,8,9}
		};
		display(arr);
		rotate(arr);
		
		}
	
	
	public static void display(int arr[][]){
		System.out.println();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j] + "\t");
				}
			System.out.println();
		}
	}	
	
	public static void rotate(int arr[][]){
		int[][] other = new int[arr[0].length][arr.length];
		
		for(int col = 0;col < arr[0].length;col++)
		{
			for(int row = 0;row < arr.length;row++)
			{
				other[col][other.length - 1 - row] = arr[row][col];
			}
		}
		display(other);		
	}
	
	

}
