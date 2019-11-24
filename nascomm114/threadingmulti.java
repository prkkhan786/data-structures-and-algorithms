package nascomm114;

public class threadingmulti extends Thread
{
	public static void main(String[] args){
		threadingmulti t1 = new threadingmulti();
		Child t2 = new Child();
		t1.start();
		t2.start();
		
	}
		public void run(){
			for(int i = 0;i<=5;i++){
				System.out.println("parent thread");
			}	
		}
		public void task2() {
			System.out.println("task 2");	
		}
		public void task1() {
		System.out.println("task 1");
	}
}

class Child extends Thread{
	 public void run()  
	    { 
	        for (int i = 0; i < 5; i++) 
	        { 
	            System.out.println("Child thread"); 
	        } 
	    } 
}

