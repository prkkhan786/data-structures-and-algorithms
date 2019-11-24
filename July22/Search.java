package July22;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		int[] arr = {11,55,22,29,9,13,88,6};
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a number");
		int data = src.nextInt();		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==data){
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);

	}
}