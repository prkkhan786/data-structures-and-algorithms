package nascomm114;

public class demothreads extends Thread {
	public void run()
	{
	task1();
	task2();
	task3();
	}
	
	private void task3() {
		System.out.println("task 3");
		// TODO Auto-generated method stub
		
	}


	private void task2() {
		System.out.println("task 2");
		// TODO Auto-generated method stub
		
	}


	private void task1() {
		System.out.println("task 1");
		// TODO Auto-generated method stub
		
	}
	public class demo3 {
		public  void main(String args[]){
			demothreads t1 = new demothreads();
			t1.start();
		}
	}
	
	

}

