package Pep10jan;

import java.util.ArrayList;
import javax.swing.JInternalFrame;

public class priorityqqueue {
	ArrayList<Integer> p = new ArrayList<>();

	public void add(int data) {
		p.add(data);
		uphepify(p.size() - 1);
	}

	private void uphepify(int i) {
		int par = (i - 1) / 2;
		if (i > 0 && p.get(i) < p.get(par)) {
			swap(i, par);
			uphepify(par);
		}
	}

	public int remove() {
		swap(p.get(0), p.get(p.size() - 1));
		int r = p.remove(p.size() - 1);
		downhepify(0);
		return r;
	}

	public void downhepify(int pa) {
		int cl = 2 * pa + 1;
		int rc = 2 * pa + 2;
		int min = pa;
		if (cl < p.size() && p.get(cl) < p.get(min)) {
			min = cl;
		}
		if (rc < p.size() && p.get(rc) < p.get(min)) {
			min = rc;
		}
		if (min!= pa) {
			swap(min, pa);
			downhepify(min);
		}
	}

	private void swap(Integer integer, Integer integer2) {
		int ith = p.get(integer);
		int jth = p.get(integer2);
		p.add(integer, jth);
		p.add(integer2, ith);
	}

	public int peek() {
		return p.get(0);
	}

	public int size() {
		return p.size();

	}

	public boolean isempty() {
		return p.isEmpty();
	}

	public  void display() {
		for(int i : p){
			System.out.println(i);
		}
	}
}
