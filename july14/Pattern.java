package july14;

import java.util.Scanner;

public class Pattern {
	
	public static void main(String[] args) {
		

		Scanner src = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = src.nextInt();
		
		int z=1;
		while(z<=n){
			int r=1;
			while(r<=z){
				System.out.print("*");
				r++;
			}
			System.out.println();
			z++;
		}
	
	}

}
