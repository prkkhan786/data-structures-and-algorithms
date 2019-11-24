package oct28;

import java.awt.font.GlyphJustificationInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import Own.hackerrank;
import Sept23.LinkedLists;
import aug20.QueenSetwithpermutation;

public class Graph {

	HashMap<String, HashMap<String, Integer>> vecs = new HashMap<>();

	public int CountVertices() {
		return vecs.size();
	}

	public boolean Containvertex(String vname) {
		return vecs.containsKey(vname);
	}

	public void Addvertex(String vname) {
		if (!vecs.containsKey(vname)) {
			vecs.put(vname, new HashMap<>());
		}
	}

	public boolean containedge(String vname1, String vname2) {
		if (Containvertex(vname1) && Containvertex(vname2)) {
			return vecs.get(vname1).containsKey(vname2);
		} else {
			return false;
		}
	}

	public void addedge(String vname, String vname1, int weight) {
		if (Containvertex(vname) && Containvertex(vname1)) {
			vecs.get(vname).put(vname1, weight);
			vecs.get(vname1).put(vname, weight);
		}
	}

	public void removeEdge(String vname, String vname1) {
		if (containedge(vname, vname1)) {
			vecs.get(vname).remove(vname1);
			vecs.get(vname1).remove(vname);
		}
	}

	public void display() {
		System.out.println("---------------------------");
		for (String vertex : vecs.keySet()) {
			System.out.println(vertex + " ->" + vecs.get(vertex));
		}
		System.out.println("---------------------------");
	}

	public int countEdge() {
		int size = 0;
		for (String v : vecs.keySet()) {
			size += vecs.get(v).size();
		}
		return size / 2;
	}

	public void removevertex(String vname) {
		if (Containvertex(vname)) {
			for (String nvrtx : vecs.get(vname).keySet()) {
				vecs.get(nvrtx).remove(vname);
			}
			vecs.remove(vname);
		}
	}

	public boolean HasPath(String vname, String vname1) {
		HashMap<String, Boolean> vis = new HashMap<>();
		vis.put(vname, true);
		boolean s = hp(vname, vname1, vis);
		vis.remove(vname);
		return s;
	}

	private boolean hp(String u, String v, HashMap<String, Boolean> hp) {

		if (vecs.get(u).containsKey(v))
			return true;

		for (String x : vecs.get(u).keySet()) {
			if (!hp.containsKey(x)) {
				hp.put(x, true);
				boolean xt = hp(x, v, hp);
				if (xt)
					return true;
				hp.remove(x);
			}
		}
		return false;
	}

	public void allpaths(String u, String v) 
	{
		ArrayList<String> a = new ArrayList<>();
		HashMap<String, Boolean> vis = new HashMap<>();
		a.add(u);
		vis.put(u, true);
		allpaths(u, v, vis, a);
		a.remove(a.size() - 1);
		vis.remove(u);
	}

	private void allpaths(String u, String v, HashMap<String, Boolean> hp, ArrayList<String> a) {
		if (u.equals(v)) {
			System.out.println(a);
			return;
		}
		for (String x : vecs.get(u).keySet()) {
			if (!hp.containsKey(x)) {
				hp.put(x, true);
				a.add(x);
				allpaths(x, v, hp, a);
				a.remove(a.size() - 1);
				hp.remove(x);
			}

		}

	}

	public boolean haspath2(String src, String des) {
		HashMap<String, Boolean> vis = new HashMap<>();
		return haspath2helper(src, des, vis);
	}

	private boolean haspath2helper(String src, String des, HashMap<String, Boolean> vis) {
		if (src.equals(des)) {
			return true;
		}
		vis.put(src, true);
		for (String n : vecs.get(src).keySet()) {
			if (!vis.containsKey(n)) {
				boolean res = haspath2helper(n, des, vis);
				if (res == true) {
					return true;
				}
			}
		}
		return false;
	}

	public void printpath2(String src, String des) {
		HashMap<String, Boolean> vis = new HashMap<>();
		printpath2helper(src, des, vis, "", 0);
	}

	private void printpath2helper(String src, String des, HashMap<String, Boolean> vis, String psf, int cost) {
		if (src.equals(des)) {
			System.out.println(psf + "@" + cost);
			return;
		}
		vis.put(src, true);
		for (String n : vecs.get(src).keySet()) {
			if (!vis.containsKey(n)) {
				printpath2helper(n, des, vis, psf + n, cost + vecs.get(src).get(n));
			}
		}
		vis.remove(src, false);
	}

	int sc;
	String scp;
	int lc;
	String lcp;
	int jlc;
	String jlp;

	public void multisolver(String src, String des, int k, int jlw) {
		sc = Integer.MAX_VALUE;
		scp = "";
		lc = Integer.MIN_VALUE;
		lcp = "";
		jlc = Integer.MAX_VALUE;
		jlp = "";
		multisolverhelper(src, des, new HashSet<>(), "", 0, jlw, k);
	}

	private void multisolverhelper(String src, String des, HashSet<String> vis, String psf, int cost, int jlw, int k) {
		if (src.equals(des)) {
			if (cost < sc) {
				sc = cost;
			}
			if (cost > lc) {
				lc = cost;
			}
			System.out.println(psf + "@" + cost + "smallest cost ->" + sc + "largest ->" + lc);
			return;
		}
		vis.add(src);
		for (String n : vecs.get(src).keySet()) {
			if (!vis.contains(n)) {
				multisolverhelper(n, des, vis, psf + n, cost + vecs.get(src).get(n), jlw, k);
			}
		}
		vis.remove(src);
	}

	public class pair implements Comparable<pair> {
		int cost;
		String psf;

		public pair(int cost, String psf) {

		}

		@Override
		public int compareTo(pair o) {
			return this.cost - o.cost;
		}
	}

	private class tpair {
		String vname;
		String psf;

		public tpair(String vname, String psf) {
			this.vname = vname;
			this.psf = psf;
		}
	}

	public boolean bfs(String src, String des) {
		LinkedList<tpair> que = new LinkedList<>();
		HashSet<String> visited = new HashSet<>();
		que.addLast(new tpair(src, src));
		while (que.size() > 0) {
			tpair rp = que.removeFirst();
			visited.add(rp.vname);
			System.out.println(rp.vname + "@" + rp.psf);
			if (rp.vname.equals(des)) {
				return true;
			}
			for (String nbr : vecs.get(rp.vname).keySet()) {
				if (!visited.contains(nbr)) {
					que.addLast(new tpair(nbr, rp.psf + nbr));
				}
			}
		}
		return false;
	}

	public boolean dfs(String src, String des) {
		LinkedList<tpair> Stack = new LinkedList<>();
		HashSet<String> visited = new HashSet<>();
		Stack.addLast(new tpair(src, src));
		while (Stack.size() > 0) {
			tpair rp = Stack.removeFirst();
			visited.add(rp.vname);
			System.out.println(rp.vname + "@" + rp.psf);
			if (rp.vname.equals(des)) {
				return true;
			}
			for (String nbr : vecs.get(rp.vname).keySet()) {
				if (!visited.contains(nbr)) {
					Stack.addFirst(new tpair(nbr, rp.psf + nbr));
				}
			}
		}
		return false;
	}

	public void bft() { // bf traversal
		HashSet<String> visited = new HashSet<>();
		for (String n : vecs.keySet()) {
			if (!visited.contains(n)) {
				bftcomponent(n, visited);
			}
		}
	}

	public void bftcomponent(String src, HashSet<String> visited) {
		LinkedList<tpair> que = new LinkedList<>();
		que.addLast(new tpair(src, src));
		while (que.size() > 0) {
			tpair rp = que.removeFirst();
			visited.add(rp.vname);
			System.out.println(rp.vname + "@" + rp.psf);
			for (String nbr : vecs.get(rp.vname).keySet()) {
				if (!visited.contains(nbr)) {
					que.addLast(new tpair(nbr, rp.psf + nbr));
				}
			}
		}
	}

	public void dft() {
		HashSet<String> visited = new HashSet<>();
		for (String n : vecs.keySet()) {
			if (!visited.contains(n)) {
				// dftComponent(n, visited);
				dftcomponentR(n, n, visited);
			}
		}
	}

	private void dftComponent(String src, HashSet<String> visited) {
		LinkedList<tpair> Stack = new LinkedList<>();
		Stack.addLast(new tpair(src, src));
		while (Stack.size() > 0) {
			tpair rp = Stack.removeFirst();
			visited.add(rp.vname);
			System.out.println(rp.vname + "@" + rp.psf);
			for (String nbr : vecs.get(rp.vname).keySet()) {
				if (!visited.contains(nbr)) {
					Stack.addFirst(new tpair(nbr, rp.psf + nbr));
				}
			}
		}
	}

	private void dftcomponentR(String src, String psf, HashSet<String> visited) {
		visited.add(src);
		for (String n : vecs.get(src).keySet()) {
			if (!visited.contains(n)) {
				dftcomponentR(n, psf + n, visited);
			}
		}
		visited.remove(src);
		System.out.println(src + "@" + psf);
	}

	public boolean isconnected() {
		ArrayList<String> l = new ArrayList<>(vecs.keySet());
		String src = l.get(0);
		HashSet<String> visited = new HashSet<>();
		bftcomponent(src, visited);
		return visited.size() == vecs.size();
	}

	public boolean iscyclic() {
		HashSet<String> visited = new HashSet<>();
		for (String n : vecs.keySet()) {
			if (!visited.contains(n)) {
				boolean cycle = iscyclicComponent(n, visited);
				if (cycle) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean iscyclicComponent(String src, HashSet<String> visited) {
		LinkedList<tpair> que = new LinkedList<>();
		que.addLast(new tpair(src, src));
		while (que.size() > 0) {
			tpair rp = que.removeFirst();
			if (visited.contains(rp.vname)) {
				return true;
			}
			visited.add(rp.vname);
			System.out.println(rp.vname + "@" + rp.psf);
			for (String nbr : vecs.get(rp.vname).keySet()) {
				if (!visited.contains(nbr)) {
					que.addLast(new tpair(nbr, rp.psf + nbr));
				}
			}
		}
		return false;
	}

	public void gcc() {
		ArrayList<String> a = new ArrayList<>();
		HashSet<String> visited = new HashSet<>();
		for (String nbr : vecs.keySet()) {
			if (!visited.contains(nbr)) {
				String res = gcccomponent(nbr, visited);
				System.out.println(res);
			}

		}
	}

	private String gcccomponent(String src, HashSet<String> visited) {
		LinkedList<tpair> que = new LinkedList<>();
		que.addLast(new tpair(src, src));
		String comp = "";
		while (que.size() > 0) {
			tpair rp = que.removeFirst();
			if (visited.contains(rp.vname)) {
				continue;
			}
			visited.add(rp.vname);
			comp += rp.vname;
			for (String nbr : vecs.get(rp.vname).keySet()) {
				if (!visited.contains(nbr)) {
					que.addLast(new tpair(nbr, rp.psf + nbr));
				}
			}
		}
		return comp;
	}

	class Dpair implements Comparable<Dpair> {
		String vname;
		String psf;
		int cost;

		public Dpair(String vname, String psf, int cost) {
			this.vname = vname;
			this.psf = psf;
			this.cost = cost;
		}

		@Override
		public int compareTo(Dpair o) {
			return this.cost - o.cost;
		}
	}

	public void dijistra(String src) {
		PriorityQueue<Dpair> a = new PriorityQueue<>();
		HashSet<String> visited = new HashSet<>();
		a.add(new Dpair(src, src, 0));
		while (a.size() > 0) {
			Dpair r = a.remove();
			if (visited.contains(r.vname)) {
				continue;
			}
			visited.add(r.vname);
			System.out.println(r.vname + " via " + r.psf + "cost" + r.cost);
			for (String nbr : vecs.get(r.vname).keySet()) {
				if (!visited.contains(nbr)) {
					a.add(new Dpair(nbr, r.psf + nbr, r.cost + vecs.get(r.vname).get(nbr)));
				}
			}
		}
	}

	class Ppair implements Comparable<Ppair> {
		String vname;
		String pname;
		int cost;

		public Ppair(String vname, String pname, int cost) {
			this.vname = vname;
			this.pname = pname;
			this.cost = cost;
		}

		@Override
		public int compareTo(Ppair o) {
			return this.cost - o.cost;
		}
	}

	public Graph prims() {
		Graph mst = new Graph();
		ArrayList<String> allvert = new ArrayList<>(vecs.keySet());
		String src = allvert.get(0);
		PriorityQueue<Ppair> a = new PriorityQueue<>();
		HashSet<String> visited = new HashSet<>();

		a.add(new Ppair(src, null, 0));
		while (a.size() > 0) {
			Ppair rp = a.remove(); // remove
			if (visited.contains(rp.vname)) {
				continue;
			}
			visited.add(rp.vname); // mark
			mst.Addvertex(rp.vname);
			if (rp.pname != null) { // work
				mst.addedge(rp.vname, rp.pname, rp.cost);
			}
			for (String nbr : vecs.get(rp.vname).keySet()) { // nbr
				if (!visited.contains(nbr)) {
					a.add(new Ppair(nbr, rp.vname, vecs.get(nbr).get(rp.vname)));
				}
			}
		}
		return mst;
	}

	private class bpair {
		String vname;
		boolean color;

		public bpair(String vname, boolean color) {
			this.vname = vname;
			this.color = color;
		}
	}

	public boolean isbiapartite() {
		HashMap<String, Boolean> visited = new HashMap();
		for (String n : vecs.keySet()) {
			if (!visited.containsKey(n)) {
				boolean cycle = isbiapartiteComponent(n, visited);
				if (cycle == false) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isbiapartiteComponent(String src, HashMap<String, Boolean> visited) {
		LinkedList<bpair> que = new LinkedList<>();
		que.addLast(new bpair(src, false));
		while (que.size() > 0) {
			bpair rp = que.removeFirst();
			if (visited.containsKey(rp.vname)) {
				if (rp.color == visited.get(rp.vname)) {
					continue;
				} else {
					return false;
				}
			}
			visited.put(rp.vname, rp.color);
			for (String nbr : vecs.get(rp.vname).keySet()) {
				if (!visited.containsKey(nbr)) {
					que.addLast(new bpair(nbr, !rp.color));
				}
			}
		}
		return true;
	}
}