package oct25;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
public class nodeclient 
{
	public static void main(String[] args)
	{
		ArrayList<ArrayList<Integer>> li = new ArrayList<>();
		li.add(new ArrayList<>(Arrays.asList(12,13,15,16)));
		li.add(new ArrayList<>(Arrays.asList(22,50,30,40)));
		li.add(new ArrayList<>(Arrays.asList(30,40,50)));
		li.add(new ArrayList<>(Arrays.asList(40,90)));
		PriorityQueue<node> p = new PriorityQueue<>();
		for(int i =0;i<li.size();i++){
			node node = new node(i, 0, li.get(i).get(0));
			p.add(node);
		}
		while(p.size()>0){
			node node = p.remove();
			System.out.println(node.value);
			node.ln++;
			if(node.dn< li.get(node.ln).size()){
				node.value = li.get(node.ln).size();
				p.add(node);
			}
		}
	}
	private static class node implements Comparable<node>
	{
		int ln;
		int dn;
		int value;
		public node(int ln,int dn,int value)
		{
			this.ln = ln;
			this.dn = dn;
			this.value = value;
		}
		@Override
		public int compareTo(node o) 
		{
			return this.value - o.value;
		}
	}
}
