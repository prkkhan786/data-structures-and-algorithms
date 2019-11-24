package Own;

public class Test {

		private int a;
		private int b;
		
		public Test(int a, int b) {
			// TODO Auto-generated constructor stub
			
			this.a= a;
			this.b=b;
		}
		
		public void add(int a,int b){
			System.out.println(a+b);
		}
		
		public void add(int a,int b,int c){
			System.out.println(a+b+c);
		}
		public static void main(String[] args){
//			Test t1 = new Test(2, 5);
//			t1.a = 25;
			B b1= new B(2, 10);
//			System.out.println(b1.a);
//			System.out.println(b1.b);
			b1.add(25, 25);
		}	
}

class B extends Test{
	public int a = 25;
	public int b = 50;
	public B(int a, int b) {
		super(a, b);
		this.a=a;
		this.b=b;
	}
	
	public void add(int a,int b){
		System.out.println(a*b);
	}
}




