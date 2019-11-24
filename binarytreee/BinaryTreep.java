package binarytreee;
import java.util.ArrayList;
import java.util.Stack;
public class BinaryTreep {
	private class Node 
	{
		int data;
		Node left;
		Node right;
	}
	private int size;
	private Node root;
	public BinaryTreep(int[] arr) {
		Stack<Node> stk = new Stack<>();
		for (int val : arr) {
			if (val == -1) {
				stk.pop();
			} else {
				Node node = new Node();
				node.data = val;
				size++;
				if (stk.isEmpty()) {
					root = node;
				} else {
					Node top = stk.peek();
					if (top.left == null) {
						top.left = node;
					} else {
						top.right = node;
					}
				}
				stk.push(node);
			}
		}
	}
	 public BinaryTreep(int [] pre,int [] in){
	 root = getnode(pre, in, 0, pre.length -1, 0, in.length -1);
	 }
	private Node getnode(int[] pre, int[] in, int prei, int pree, int ins, int ine) {
		if (prei > pree || ins > ine) {
			return null;
		}
		Node node = new Node();
		node.data = pre[prei];
		int idx;
		for (idx = ins; idx <= ine; idx++) {

			if (node.data == in[idx]) {
				break;
			}
		}
		int lh = idx - ins;
		node.left = getnode(pre, in, prei + 1, prei + lh, ins, idx - 1);
		node.right = getnode(pre, in, prei + lh + 1, pree, idx + 1, ine);
		return node;
	}

	//public BinaryTreep(int[] post, int[] in) {
		//root = getnode2(post, in, 0, post.length - 1, 0, in.length - 1);
	//}

	private Node getnode2(int[] post, int[] in, int posts, int poste, int ins, int ine) {
		if (posts > poste || ins > ine) {
			return null;
		}
		Node node = new Node();
		node.data = post[poste];
		int idx;
		for (idx = ins; idx <= ine; idx++) {
			if (node.data == in[idx]) {
				break;
			}
		}
		int lh = idx - ins;
		node.left = getnode2(post, in, posts, posts + lh - 1, ins, idx - 1);
		node.right = getnode2(post, in, posts + lh, poste - 1, idx + 1, ine);
		return node;
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

	public int size() {
		return size2(root);
	}

	private int size2(Node node) {
		if (node == null) {
			return 0;
		}
		int lsize = size2(node.left);
		int rsize = size2(node.right);
		return lsize + rsize + 1;
	}

	public int hieght() {
		return hieght2(root);
	}

	private int hieght2(Node node) {
		if (node == null) {
			return 0;
		}
		int lht = hieght2(node.left);
		int rht = hieght2(node.right);
		int finalhight = Math.max(lht, rht);
		return finalhight + 1;
	}

	public int mox() {
		return max2(root);
	}

	private int max2(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int lmax = max2(node.left);
		int rmax = max2(node.right);
		return Math.max(node.data, Math.max(lmax, rmax));
	}

	public boolean find(int data) {
		return find2(root, 37);
	}

	private boolean find2(Node node, int data) {
		if (node == null) {
			return false;
		}
		if (node.data == data) {
			return true;
		}
		boolean findl = find2(node.left, data);
		if (findl == true) {
			return true;
		}
		boolean findr = find2(node.right, data);
		if (findr == true) {
			return true;
		} else
			return false;

	}

	public ArrayList<Integer> nodetoroot(int data) {
		return nodetoroot2(root, data);
	}

	private ArrayList<Integer> nodetoroot2(Node node, int data) {
		if (node == null) {
			return new ArrayList<>();
		}
		if (node.data == data) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(node.data);
			return list;
		}
		ArrayList<Integer> list1 = nodetoroot2(node.left, data);
		if (list1.size() > 0) {
			list1.add(node.data);
			return list1;
		}
		ArrayList<Integer> list2 = nodetoroot2(node.right, data);
		if (list2.size() > 0) {
			list2.add(node.data);
			return list2;
		}
		return new ArrayList<>();
	}

	private Node findnode2(Node node, int data) {
		if (node == null) {
			return null;
		}
		if (node.data == data) {
			return node;
		}
		Node findl = findnode2(node.left, data);
		if (findl != null) {
			return findl;
		}
		Node findr = findnode2(node.right, data);
		if (findr != null) {
			return findr;
		} else
			return null;

	}

	public void down() {
		Node node = findnode2(root, 37);
		kdown(root, 2);
	}

	private void kdown(Node node, int k) {
		if (k < 0 || node == null) {
			return;
		}
		if (k == 0) {
			System.out.println(node.data);
			return;
		}
		kdown(node.left, k - 1);
		kdown(node.left, k - 1);
	}

	public void printshiblings() {
		printshiblinghelper(root, null);
	}

	private void printshiblinghelper(Node node, Node parent) {
		if (node == null) {
			return;
		}
		if (parent != null && parent.left == node && parent.right == null) {
			System.out.println(node.data);
		} else if (parent != null && parent.right == node && parent.left == null) {
			System.out.println(node.data);
		}
		printshiblinghelper(node.left, node);
		printshiblinghelper(node.right, node);
	}

	public void removeleaves() {
		removeleavehelper(root, null);
	}

	private void removeleavehelper(Node node, Node parent) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			if (parent.left == node) {
				parent.left = null;
			} else if (parent.right == node) {
				parent.right = null;
			}
			return;
		}
		removeleavehelper(node.left, node);
		removeleavehelper(node.right, node);
	}

	public void roottonodepathinrange(int a, int b) {
		roottonodepathinrangehelper(root, 0, a, b, "");
	}

	private void roottonodepathinrangehelper(Node node, int ssf, int b1, int b2, String asf) {
		if (node == null) {
			return;
		}

		if (node.left == null && node.right == null) {
			ssf += node.data;
			asf += " " + node.data;
			if (ssf >= b1 && ssf <= b2) {
				System.out.println(asf);
			}
			return;
		}
		roottonodepathinrangehelper(node.left, ssf + node.data, b1, b2, asf + " " + node.data);
		roottonodepathinrangehelper(node.right, ssf + node.data, b1, b2, asf + " " + node.data);
	}

	public void roottonodepathinrangewitharr(int a, int b) {
		roottonodepathinrangehelperwitharr(root, 0, a, b, new ArrayList<>());
	}

	private void roottonodepathinrangehelperwitharr(Node node, int ssf, int b1, int b2, ArrayList<Integer> arr) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			arr.add(node.data);
			ssf += ssf + node.data;
			if (ssf >= b1 && ssf <= b2) {
				for (int val : arr) {
					System.out.println(val);
				}
			}
			return;
		}
		arr.add(node.data);
		roottonodepathinrangehelperwitharr(node.left, ssf + node.data, b1, b2, arr);
		roottonodepathinrangehelperwitharr(node.right, ssf + node.data, b1, b2, arr);
		arr.remove(arr.size() - 1);
	}

	public void preo() {
		preoh(root);
	}

	private void preoh(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preoh(node.left);
		preoh(node.right);

	}

	public void posto() {
		postoh(root);
	}

	private void postoh(Node node) {
		if (node == null) {
			return;
		}
		postoh(node.left);
		postoh(node.right);
		System.out.print(node.data + " ");
	}

	public void inorder() {
		inorderh(root);
	}

	private void inorderh(Node node) {
		if (node == null) {
			return;
		}
		inorderh(node.left);
		System.out.print(node.data + " ");
		inorderh(node.right);
	}

	public void levelorder() {

	}

	public int diameter() {
		return diameter1(root);
	}

	private int diameter1(Node node) {
		if (node == null) {
			return 0;
		}
		int lh = hieght2(node.left);
		int rh = hieght2(node.right);

		int ld = diameter1(node.left);
		int rd = diameter1(node.right);

		int f = lh + rh + 1;
		return Math.max(f, Math.max(ld, rd));
	}

	public class Diapair {
		int height;
		int dia;

		public Diapair(int height, int dia) {
			this.height = height;
			this.dia = dia;
		}

	}

	public int Diameterefficianet() {
		return Diameterefficianet(root).dia;
	}

	private Diapair Diameterefficianet(Node node) {
		if (node == null)
			return new Diapair(0, 0);
		Diapair lp = Diameterefficianet(node.left);
		Diapair rp = Diameterefficianet(node.right);
		int fh = Math.max(lp.height, rp.height) + 1;
		int fd = Math.max(lp.height + rp.height + 1, Math.max(lp.dia, rp.dia));
		return new Diapair(fh, fd);
	}

	public class balpair {
		boolean isbal;
		int height;

		public balpair(boolean isbal, int height) {
			this.isbal = isbal;
			this.height = height;
		}
	}

	public boolean isbalance() {
		return isbalance(root).isbal;
	}

	private balpair isbalance(Node node) {
		if (root == null) {
			return new balpair(true, 0);
		}
		balpair lp = isbalance(node.left);
		balpair rp = isbalance(node.right);

		int fh = Math.max(lp.height, rp.height) + 1;
		boolean is = false;
		if (Math.abs(lp.height - rp.height) <= 1) {
			is = true;
		}
		return new balpair(is, fh);
	}

	public class isbst {
		int max;
		int min;
		boolean isb;
		int largestbstsize;
		Node largestbstnode;

	}

	public boolean isbinaryst() {
		return isbinaryt(root).isb;
	}

	private isbst isbinaryt(Node node) {
			if(node == null)
			{
				isbst b = new isbst();
				b.max = Integer.MIN_VALUE;
				b.min = Integer.MAX_VALUE;
				b.isb = true;
				return b;
			}
			isbst lp = isbinaryt(node.left);
			isbst rp = isbinaryt(node.right);
			isbst mp = new isbst();
			mp.isb = lp.isb && rp.isb && node.data>=lp.max && node.data <= rp.min;
			mp.max = Math.max(node.data, Math.max(lp.max, rp.max));
			mp.min = Math.min(node.data, Math.min(lp.min, rp.min));
			return mp;
		}
	
	public int largestbst(){
		return largestbst(root).largestbstsize;
	}

	private isbst largestbst(Node node) {
		if(node==null)
		{
			isbst b = new isbst();
			b.max = Integer.MIN_VALUE;
			b.min = Integer.MAX_VALUE;
			b.isb = true;
			return b;
		}
		isbst lp = largestbst(node.left);
		isbst rp = largestbst(node.right);
		isbst mp = new isbst();
		mp.isb = lp.isb && rp.isb && node.data>lp.max && node.data < rp.min;
		mp.max = Math.max(node.data, Math.max(lp.max, rp.max));
		mp.min = Math.min(node.data, Math.min(lp.min, rp.min));
		if(mp.isb){
			mp.largestbstnode = node;
			mp.largestbstsize = lp.largestbstsize + rp.largestbstsize +1;
		}else if(lp.largestbstsize>rp.largestbstsize){			
			mp.largestbstsize = lp.largestbstsize;
			mp.largestbstnode = lp.largestbstnode;
		}else{
			mp.largestbstsize = rp.largestbstsize;
			mp.largestbstnode = rp.largestbstnode;
		}
		return mp;
	}
}