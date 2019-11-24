	package july14;

import java.util.Scanner;

public class Pattern3 {
	
	
	
public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = src.nextInt();
		
		int a = 1;
		int t1 = 0;
		int t2 = 1;
		int nextTerm = t1 + t2;
		while(a<=n){
			int b = 1;
			while(b<=a){
				System.out.print(t1 + " ");
				
				t1 = t2;
				t2 = nextTerm;
				nextTerm = t1 + t2;
				b++;		
			}
			
			System.out.println();
			a++;
			

	}
}

}
