package Own;

import java.io.InputStream;
import java.util.Scanner;

public class onbit {

	public static void main(String[] args) {	
		
	Scanner src = new Scanner(System.in);
	char ch = src.nextLine().charAt(0);
	
	
	if(ch>='A' && ch <='Z'){
		System.out.println("upper");
	}
	else if(ch>='a' && ch <='z'){
		System.out.println("lower");
	}
	
		
	}

	
	
}



			
