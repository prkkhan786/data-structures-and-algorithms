package Own;

import java.util.ArrayList;
import java.util.Stack;

import Treesbaisc.genericTree;

public class Treegenericpractice {
	public int size;
	public Node root;
	private class Node{
		private int data;
		private ArrayList<Node> children = new ArrayList<>();
	}
	public static void main(String [] args){
    	int arr [] = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
    	genericTree t1 = new genericTree(arr);
    	t1.display();	
    }
	public Treegenericpractice(int [] arr){
		Stack<Node> stack = new Stack<>();
		for(int val : arr){
			if(val==-1){
				stack.pop();
			}
			else{
				Node node = new Node();
				node.data = val;
				size++;
				if(stack.size()>0){
					stack.peek().children.add(node);
				}else{
					root = node;
				}
				stack.push(node);
			}
		}
	}
	public int size(){
		return size(root);
	}
	private int size(Node node) {
		size = 0;
		for(Node child: node.children){
			int csize=size(child);
			size=size+csize;
		}
		return size+1;
	}
	public void display(){
		displayhelp(root);
	}
	private void displayhelp(Node node) {
		// TODO Auto-generated method stub
		String str = node.data + "->";
		for(Node child: node.children){
			str+= child.data;
			displayhelp(child);
		}
		System.out.println(str+ ".");	
	}
}
