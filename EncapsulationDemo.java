// encapsulation -> binding data with methods	
public class EncapsulationDemo {

	private String name;
	private int rollno;
	// getters
	// setters

	public void Setrollno(int n) {
		this.rollno = n;
	}

	public void setname(String s) {
		this.name = s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.setter("hello");
		System.out.println(c.getter());

	}

}

class Car {
	private String name;
	private int model;

	public void setter(String name) {
		this.name = name;
	}

	public String getter() {
		return this.name;
	}

}
