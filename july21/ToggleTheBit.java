package july21;

import java.util.Scanner;

public class ToggleTheBit {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = src.nextInt();
		System.out.println(Integer.toBinaryString(n));
		System.out.println("Enter a number");
		int k = src.nextInt();
		int mask ;
		mask = 1<<k;
		mask =  mask ^ n;
		System.out.println(Integer.toBinaryString(mask));
		
		
		
	}

}
