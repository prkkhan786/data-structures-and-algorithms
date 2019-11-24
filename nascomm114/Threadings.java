package nascomm114;

public class Threadings extends Thread{
	
	public static void main(String[] args) {
		Threadings t1 = new Threadings();
		t1.start();
		t1.setName("user 01");
		for(int i=0;i<=5;i++){
//			 System.out.println("thread");
			 try
			 { 
				t1.join();
			 }
			 catch (Exception e) 
			 {
				e.printStackTrace();
			 }
			 
			 System.out.println("main  "+ Thread.currentThread().getName());
		}	
		
	}
	public void run(){
		
		for(int i=0;i<=5;i++){
			 System.out.println("it is run thread");
			 try
			 { 
				 Thread.sleep(2000);
			 }
			 catch (Exception e) 
			 {
				System.out.println("i wan to stop");
				continue;
			 }
		}	
	}
	
}
