package july14;

import java.util.Scanner;

public class Pattern2 {
	

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = src.nextInt();
		
		int a = 1;
		int sum = 1;
		while(a<=n){
			int b = 1;
			while(b<=a){
				System.out.print(sum + " ");
				sum=sum+1;
				
				b++;		
			}
			System.out.println();
			
			a++;
			

	}
}

}
