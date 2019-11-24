package oct14;

import java.util.Iterator;

public class BST implements Iterable<Integer>{
	private class Node{
		int data;
		Node left;
		Node right;
	}
	private int size;
	private Node root;
	public BST(int arr[]){
		root = construct(arr, 0, arr.length-1);
	}
	private Node construct(int arr[] ,int lo,int hi){
		if(lo>hi){
			return null;
		}
		int mid = (lo+hi)/2;
		Node n = new Node();
		n.data = arr[mid];
		n.left = construct(arr, lo, mid-1);
		n.right = construct(arr, mid+1, hi);
		return n;
	}
	public void display() {
		displayhelper(root);
	}
	private void displayhelper(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		str += node.left != null ? node.left.data + "" : ".";
		str += " <-" + node.data + " ->";
		str += node.right != null ? node.right.data + "" : ".";
		System.out.println(str);
		displayhelper(node.left);
		displayhelper(node.right);
	}
	public int min(){
		return min(root);
	}
	private int min(Node node) {
		if(node.left!= null){
			return min(node.left);	
		}else{
			return node.data;
		}
	}
	public int max(){
		return max(root);
	}
	
	private int max(Node node) {
		if(node.right!= null){
			return max(node.right);
		
		}else{
			return node.data;
		}
	}
	
	public boolean find(int data){
		return find(root,data);
	}

	private boolean find(Node node, int data) {
		if(data>node.data){
			return find(node.right, data);
		}else if(data<node.data){
			return find(node.left, data);
		}else{
			return true;
		}
	}
	public void add(int data){
		root = add(root,data);
	}
	private Node add(Node node, int data) {
		if(node == null){
			Node n = new Node();
			n.data = data;
			return n;
		}
		if(data>node.data){
			node.right =  add(node.right, data);
		}
		else if(data<node.data){
		node.left =  add(node.left, data);
		}
		return node;
	}
public void remove(int data){
		root =remove(root,data);
}
	private Node remove(Node node, int data) {
		if(node==null){
			return null;
		}
		if(data>node.data){
			node.right= remove(node.right, data);
		}else if(data<node.data){
			node.left = remove(node.left, data);
		}
	else{
				if(node.left==null && node.right == null)
				{
					return null;
				}else if(node.left==null)
				{
					return node.right;	
				}else if(node.right == null)
				{
					return node.left;
				}else
				{
					int lmax = max(node.left);
					node.data = lmax;
					node.left = remove(node.left, lmax);	
				}
			}
		return node;
	}
	public void pir(int l,int h){	
		pir(root,l,h);
	}
	private void pir(Node node, int l, int h) {	
		if(node==null){
			return;
		}
		if(node.data<l){
			pir(node.right, l, h);
		}
		else if(node.data>h){
			pir(node.left, l, h);
		}else{
			pir(node.left, l, h);
			System.out.println(node.data + " ");
			pir(node.right, l, h);
		}
	}
	@Override
	public Iterator<Integer> iterator() {
		return  new BSTIterator();
	}
	
	class BSTIterator implements Iterator<Integer>{
		@Override
		public boolean hasNext()
		{
			
			return false;
		}
		public BSTIterator() 
		{
			
		}

		@Override
		public Integer next() 
		{
			return size;
			
		}
		
	}
}
