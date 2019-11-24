package Pep10jan;

public class AVL {
	private class Node {
		int data;
		Node left;
		Node right;
		int ht;
		int b;
	}

	Node root;
	int size;

	public AVL(int[] sa) {
		root = construct(sa, 0, sa.length - 1);
	}

	private Node construct(int[] sa, int s, int e) {
		if (s > e) {
			return null;
		}
		int mid = (s + e) / 2;
		Node node = new Node();
		node.data = sa[mid];
		node.left = construct(sa, s, mid - 1);
		node.right = construct(sa, mid + 1, e);
		this.sethnb(node);
		return node;
	}

	public void display() {
		display(root);
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}
		String str = "<-" + node.data + "[" + node.ht + " " + node.b + "]" + " -> ";
		String lstr = node.left == null ? "." : node.left.data + " ";
		String rsts = node.right == null ? "." : node.right.data + " ";
		System.out.println(lstr + str + rsts);
		display(node.left);
		display(node.right);
	}

	public boolean find(int data) {
		return find(root, data);
	}

	private boolean find(Node node, int data) {
		if (node == null) {
			return false;
		}
		if (node.data > data) {
			return find(node.left, data);
		} else if (node.data < data) {
			return find(node.right, data);
		} else {
			return true;
		}
	}

	private void sethnb(Node node) {
		int lh = node.left == null ? 0 : node.left.ht;
		int rh = node.right == null ? 0 : node.right.ht;
		node.ht = Math.max(lh, rh) + 1;
		node.b = lh - rh;
	}

	public int min() {
		return min(root);
	}

	private int min(Node node) {
		if (node.left != null) {
			return min(node.left);
		} else {
			return node.data;
		}
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {

		if (node.right != null) {
			return max(node.right);
		} else {
			return node.data;
		}
	}

	public void add(int data) {
		root = add(root, data);
	}

	private Node add(Node node, int data) {
		if (node == null) {
			Node bn = new Node();
			bn.data = data;
			sethnb(bn);
			return bn;
		}
		if (data > node.data) {
			node.right = add(node.right, data);
		} else if (data < node.data) {
			node.left = add(node.left, data);
		} else {

		}

		sethnb(node);

		if (node.b > 1 && data < node.left.data) {
			node = rightrotation(node);
		} else if (node.b > 1 && data > node.left.data) { // lr
			node.left = leftrotation(node.left);
			node = rightrotation(node);
		} else if (node.b < -1 && data > node.right.data) { // rr
			node = leftrotation(node);
		} else if (node.b < -1 && data < node.right.data) { // rl
			node.right = rightrotation(node.right);
			node = leftrotation(node);
		}
		return node;
	}

	private Node rightrotation(Node z) {
		Node y = z.left;
		Node t = y.right;
		y.right = z;
		z.left = t;
		this.sethnb(z);
		this.sethnb(y);
		return y;
	}

	private Node leftrotation(Node z) {
		Node y = z.right;
		Node t = y.left;
		y.left = z;
		z.right = t;
		this.sethnb(z);
		this.sethnb(y);
		return y;
	}

	public Node remove(Node node, int data) {
		if (node == null) {
			return null;
		}
		if (node.data > data) {
			node.left = remove(node.left, data);
		} else if (node.data < data) {
			node.right = remove(node.right, data);
		} else {
			if (node.left != null && node.right == null) {
				return null;
			} else if (node.left != null && node.right == null) {
				return node.left;
			} else if (node.left == null && node.right != null) {
				return node.right;
			} else {
				int max = max(node.left);
				node.data = max;
				node.left = remove(node.left, data);
			}

		}

		sethnb(node);
		if (node.b > 1 && data < node.left.data) {
			node = rightrotation(node);
		} else if (node.b > 1 && data > node.left.data) { // lr
			node.left = leftrotation(node.left);
			node = rightrotation(node);
		} else if (node.b < -1 && data > node.right.data) { // rr
			node = leftrotation(node);
		} else if (node.b < -1 && data < node.right.data) { // rl
			node.right = rightrotation(node.right);
			node = leftrotation(node);
		}
		return node;
	}

}
