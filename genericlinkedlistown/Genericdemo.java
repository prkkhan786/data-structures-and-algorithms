package genericlinkedlistown;
public class Genericdemo {
	public static void main(String[] args) {
		Container obj =new Container("hi");
		System.out.println(obj.name);
	}
}
class Container<T>{
	T name;
	public Container(T src) {
		this.name = src;
	}
}


