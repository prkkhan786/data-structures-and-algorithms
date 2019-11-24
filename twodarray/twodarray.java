package twodarray;

import java.util.Scanner;

public class twodarray {

	public static void main(String[] args) {
		
		int arr[][] = null;
		arr = new int [2][4];
		Scanner src = new Scanner(System.in);
		
		
		for(int row= 0;row<=arr.length-1;row++){
			for(int col=0;col<=arr[0].length-1;col++){
				System.out.println("enter the value of " + row + "[" + col + " ");
				arr[row][col] = src.nextInt();
			}
		}
		
		
		
		
	}

}
