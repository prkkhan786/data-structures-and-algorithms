package Abstractionn;

public class InterfaceDemo implements I {

	public static void main(String srgs[]) {
		// I i = new I(); cannot make object of interface

		I i = new InterfaceDemo();
		i.run();
	}

	@Override
	public void run() {
		System.out.println("run is ");
	}

}

interface I {
	int i = 0;

	void run();

}
