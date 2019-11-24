package Abstractionn;

public abstract class AbstractionDemo {

	void run() {

	}

	abstract void disp();

	abstract void hi();

	public AbstractionDemo() {

	}
}

class child extends AbstractionDemo {
	@Override
	void disp() {
		// TODO Auto-generated method stub
	}
	@Override
	void hi() {
		// TODO Auto-generated method stub
	}
	public static void main(String[] args) {
		AbstractionDemo c = new child();  // method call hoga parent ka but execute hoga child ka ho gya run time polymorphism
		c.disp();
	}
}
