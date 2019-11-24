package Own;

import java.util.Scanner;

public class hackerrank {

	public static void main(String[] args) {
		        Scanner src = new Scanner(System.in);
		        System.out.println("enter detail");
		        int a = src.nextInt();
		        int d = src.nextInt();
		        int r = src.nextInt();
		        int n = src.nextInt();
		        System.out.println(fap(a, d, n));
		        System.out.println(fgp(a, d, n));
		        System.out.println(afgp(a, d, n, r));
		    }
		    public static int fap(int a,int d ,int n){
		        return a + (n-1)*d;
		    }
		    public static int fgp(int a ,int d,int n){
		        return  a * 2^(n-1);		        
		    }
		    public static int afgp(int a ,int d,int n,int r){
		    	return ((a+(n-1)*d) * r^(n-1));         
		    }
		    
	}

