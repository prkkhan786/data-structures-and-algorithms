package oct27;

import java.util.LinkedList;
import oct27.GenericLinkedlist;

public class generictreeclient {
	public static void main(String[] args) {
		GenericLinkedlist<String> t = new GenericLinkedlist<>();
		t.addatlast("hello");
		t.addatlast("hi");
		t.addatlast("cool");
		t.addatlast("cool");
		for (String src : t) {
			System.out.println(src);
		}
	}
}
