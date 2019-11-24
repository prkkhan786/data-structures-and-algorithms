package july21;

import java.util.Scanner;

public class OfftheBit {
	
public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = src.nextInt();
		System.out.println("Enter a k");
		int k = src.nextInt();
		System.out.println(Integer.toBinaryString(n));
		int mask = 1<<k;
		mask = ~mask;
		mask = mask & n ;
		System.out.println(Integer.toBinaryString(mask));
	}
}
