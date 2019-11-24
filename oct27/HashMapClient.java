package oct27;

public class HashMapClient {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("India", 120);
		map.put("China", 140);
		map.put("Pak", 80);
		map.put("US", 25);
		map.put("UK", 30);
		map.put("Canada", 10);
		map.display();

		System.out.println(map.containskey("China"));
		System.out.println(map.containskey("France"));
		System.out.println(map.get("China"));
		System.out.println(map.get("France"));
		System.out.println(map.remove("China"));
		System.out.println(map.remove("France"));

		map.display();
		map.put("China", 140);
		map.put("India", 125);
		map.display();
		map.put("Sweden", 5);
		map.put("Norway", 2);
		map.display();
		map.put("Russia", 10);
		map.display();
	}

}
