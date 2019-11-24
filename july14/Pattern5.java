package july14;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		

		Scanner src = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = src.nextInt();
		
		
		int r = 1;
		while(r<=n){
			int c = 1;
			while(c<=n){
				if(r==c || r+c==n+1){
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				c++;
			}
			System.out.println();
			r++;

		
		}
	}

}
