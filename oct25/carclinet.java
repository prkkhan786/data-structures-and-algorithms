package oct25;
import java.util.Arrays;
public class carclinet {
	public static void main(String[] args) {
		car[] cars = new car[4];
		cars[0] = new car(100, 10, "A");
		cars[1] = new car(150, 15, "b");
		cars[2] = new car(200, 50, "c");
		cars[3] = new car(300, 20, "d");
		Arrays.sort(cars);
		for (car val : cars) {
			val.display();
		}
	}
	private static class car implements Comparable<car> {
		int speed;
		int price;
		String name;

		public car(int speed, int price, String name) {
			this.speed = speed;
			this.price = price;
			this.name = name;
		}

		@Override
		public int compareTo(car o) {
			return this.speed - o.speed;
		}

		public void display() {
			System.out.println(this.price + "" + this.speed + "" + this.name);
		}
	}
}