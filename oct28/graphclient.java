package oct28;

import nov1.Graph2;

public class graphclient {

	public static void main(String[] args) {
		Graph2 g = new Graph2();
		g.Addvertex("A");
		g.Addvertex("B");
		g.Addvertex("C");
		g.Addvertex("D");
		g.Addvertex("E");
		g.Addvertex("F");
		g.Addvertex("G");
		g.addedge("A", "B", 10);
		g.addedge("B", "C", 10);
		g.addedge("C", "D", 10);
		g.addedge("A", "D", 40);
		g.addedge("D", "E", 2);
		g.addedge("E", "F", 3);
		g.addedge("F", "G", 3);
		g.addedge("E", "G", 8);
		g.display();
		g.haspath2("A", "G");
		// g.gcc();
		// g.dijistra("A");
		// g.prims().display();
		// System.out.println(g.isbiapartite());
		// g.hamiltoniun("A");
		// g.removevertex("G");
		// g.display();

		//
		// System.out.println(g.haspath2("A", "G"));
		// g.printpath2("A", "G");
		 g.multisolver("A", "G", 0, 69);

	}
}
