package Sept23;

public class Client {

	public static void main(String[] args) {
		LinkedLists list = new LinkedLists();
		list.addatlast(20);
		list.addatlast(30);
		list.addatlast(50);
		list.addatlast(40);
		list.display();
		System.out.println();
		list.reverse();
		
		list.display();
	}

}
