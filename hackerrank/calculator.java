package hackerrank;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		boolean condition = true;
		
		while(condition!=false){
			System.out.println("enter");
			Scanner src = new Scanner(System.in);
			char ch = src.next().charAt(0);
			int n1= src.nextInt();
			int n2 = src.nextInt();
			switch (ch) {
			case '+':int a = add(n1,n2);
			System.out.println(a);
			break;	
			case '-': int b = sub(n1,n2);
			break;	
			case '*':int c =  mul(n1,n2);
			break;	
			case '/':int d = rem(n1,n2);
			break;				
			case '%':int e = mod(n1,n2);
			break;
			default:
			///	System.out.println(a + " "+ b + " " + c + " "+ d + " " + e);
				System.out.println("Invalid Operation");
				condition= false;
				break;
			}

		}
	
	}

	private static int add(int n1, int n2) {
		return n1+n2;
		
	}

	private static int sub(int n1, int n2) {
		return n1-n2;
		
	}

	private static int mul(int n1, int n2) {
		return (n1*n2);
		
	}

	private static int rem(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1%n2);
		
	}

	private static int mod(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1/n2;
		
	}
	
	

}
