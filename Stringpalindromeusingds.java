import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stringpalindromeusingds {

	public static void main(String[] args) {
//		String s = "";
//		Queue<Character> k = new LinkedList<>();
//		Stack<Character> st = new Stack<>();
//
//		for (char ch : s.toCharArray()) {
//			st.push(ch);
//			k.add(ch);
//		}
//		if (st.pop() != k.poll()) {
//			System.out.println("false");
//			return;
//		}
//
//		System.out.println("true");
		int a [] = {1, 2, 3, 4, 5};
		for(int i : a){
			System.out.println(i);
		}
		int d = 4;
		rotLeft(a, d);
		
		System.out.println();
		for(int i : a){
			System.out.println(i);
		}
		
	
	}
	   static int[] rotLeft(int[] a, int d) {
	        reverse(a,0,d-1);
	        reverse(a,d,a.length-1);
	        reverse(a,0,a.length-1);
	        return a;
	    }
	   
	   public static void reverse(int a[],int l, int r){
	        while(l<=r){
	            int temp = a[l];
	            a[l] = a[r];
	            a[r] = temp;
	            l++;
	            r--;
	        }
	    }

}
