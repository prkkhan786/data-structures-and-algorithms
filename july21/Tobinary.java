package july21;

import java.util.Scanner;

public class Tobinary {

	public static void main(String[] args) {
		
		
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = src.nextInt();
		int i=31;
		int mask=1;
		while(i>=0){
			
			mask=1<<i;
				if((mask & n) == mask )
				{
					System.out.print("1");
				}
				else{
					System.out.print("0");
					}
				
		
			
			i--;
		}
			
			
	}

}
