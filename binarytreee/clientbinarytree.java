package binarytreee;
import binarytreee.*;

public class clientbinarytree {

	public static void main(String[] args){	
		//int [] pre = {50,25,12,10,37,40,75,62,70,87};
		int [] in = {10,12,25,37,40,50,62,70,75,87};
		int [] post={10,12,40,37,25,70,62,87,75,50};
		int pre [] = {50 ,25, 12, 37, 30, 24, 33, 40, 75, 62, 87 };
		int in2  [] = {12 ,25 ,24 ,30 ,33 ,37 ,40 ,50 ,62 ,75 ,87 };
		BinaryTreep b = new BinaryTreep(pre, in2);
		System.out.println(b.largestbst());
	}
}
