package july28;

import java.util.Scanner;

public class TakeinputonArray {

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
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.println("Enter the value of " + i + " and " + j);
				arr[i][j] = src.nextInt();
			}
		}
		
		
		return arr;
		
	}
	
public static void display(int arr[][]){
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+ " ");
				
			}
			System.out.println();
		}
	}
	
	

}
