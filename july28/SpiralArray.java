package july28;

import java.util.Scanner;

public class SpiralArray {

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
	
	int rmin=0,cmin=0,rmax=arr.length-1,cmax=arr[0].length-1;
	int counter=0;
	int tna = arr.length *  arr[0].length;
	
	while(counter <= tna){
		for(int row=rmin;row<rmax;row++){
			System.out.println(arr[row][cmin]);
			counter++;
			
		}
		cmin++;
		
		for(int col=cmin;col<=cmax;col++){
			System.out.println(arr[rmax][col]);
			counter++;
		}
		rmax--;
		for(int col=rmax;col<=rmin;col++){
			System.out.println(arr[rmax][col]);
			counter++;
		}
		cmax--;
		
		for(int col=cmax;col<=cmin;col++){
			System.out.println(arr[rmax][col]);
			counter++;
		}
		rmin++;
		
	}
	
	
	}
	
	
}
