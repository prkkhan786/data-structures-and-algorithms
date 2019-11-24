package Treesbaisc;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
public class genericTree 
{
    private Node root;
    private int size;
    private class Node 
    {
                 private int data;
                  private ArrayList<Node> children = new ArrayList<>();
    }
    public genericTree(int [] arr){
         Stack<Node> stack = new Stack<>();
         for(int val:arr){
        	 if(val==-1)
        	 {
        		stack.pop(); 
        	 }
        	 else
        	 {
        		 Node node = new Node();
        		 node.data = val;
        		 size++;
        		 if(stack.size()>0){
        			 stack.peek().children.add(node);
        		 }
        		 else
        		 {
        			 root=node;      
        		 }
        		 stack.push(node);   		 
        	 }
         }
    }
    public int size (){
    	return size2(root);
    }
    public int size2(Node node)
    {
    	int size=0;
    	for(Node child: node.children){
    		int cfsize = size2(child);
    		size+=cfsize;
    	}
    	size+=1;
    	
      return size;
    }
    public boolean isEmpty(){
                    
                    return size==0;
    }
    public void display(){
    	displayhelp(root);
    }
    private void displayhelp(Node node){
    	String str = node.data + "->";
    	for(Node child : node.children){
    		str+= child.data + " ,";
    	}
    	System.out.println(str + ".");
    	for(Node child : node.children){
    		displayhelp(child);
    	}
    }
    public int max(){
    	return max2(root);
    }
    private int max2(Node node) {
    	int max = node.data;
    	for(Node child : node.children){
    		int cmax = max2(child);
    		if(cmax>max){
    			max=cmax;
    		}
    	}
    	return max;
	}
	public static void main(String [] args){
    	int arr [] = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
    	genericTree t1 = new genericTree(arr);
    	System.out.println(t1.lca(90, 100));
    	
    }
	public int height(){
		return height2(root);
	}
	private int height2(Node node) {
		int height = 0;
		for(Node child : node.children){
			int cheight = height2(child);
			if(cheight>height){
				height = cheight;
			}
			
		}
		return height+1;
	}
	public boolean find(int data){
		return find1(root, data);
		
	}
	private boolean find1(Node node,int data) {
		if(node.data==data){
			return true;
		}
		for(Node child:node.children){
			boolean ftc= find1(child, data);
			if(ftc==true){
				return true;
			}
		}
		return false;
	}
	
	
	public ArrayList<Integer> nodetoroot(int data){
		return nodetoroot1(root,data);
	}
	private ArrayList<Integer> nodetoroot1(Node node,int data) {
		if(node.data==data)
		{
			ArrayList<Integer> output = new ArrayList<>();
			output.add(node.data);
			return output;
		}
		for(Node child:node.children){
			  ArrayList<Integer> clist=  nodetoroot1(child, data);
			if(clist.size()>0){
				clist.add(node.data);
				return clist;
			}
		}
		return new ArrayList<>();
	}
	
	public int lca (int d1,int d2){
		return lca2(d1,d2);
	}
	private int lca2(int d1, int d2) {
		ArrayList<Integer> l1 = nodetoroot(d1);
		ArrayList<Integer> ri = nodetoroot(d2);
		int i = l1.size()-1;
		int j = ri.size() -1;
		while(true){
			if(l1.get(i)!=ri.get(i)){
				return i+1;
			}
		}
	}
	
}
 