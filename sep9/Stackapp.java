package sep9;

import java.util.Stack;

import stack.Stackstory;

public class Stackapp {

	public static void main(String[] args) {
		String src = "ddddddddidd";
		smallno(src);
		
		Stack<Integer> st = new Stack<>();
	}

	public static void smallno(String src) {
		Stackstory st = new Stackstory(src.length() + 1);
		int counter = 1;
		// int [] arr = new int [src.length()+1];
		for (int i = 0; i <= src.length() - 1; i++) {

			char ch = src.charAt(i);
			if (ch == 'd') {
				st.push(counter);
				counter++;
			} else {

				st.push(counter);
				counter++;
				while (!st.isEmpty()) {
					System.out.println(st.pop());
				}
			}
		}
		while (!st.isEmpty()) {
			System.out.println(st.pop());

		}
	}
}
