package nascomm114;

public class DeadlockInmainThread extends Thread{
	public static void main(String[] args){
		DeadlockInmainThread t1 = new DeadlockInmainThread();
		DeadlockInmainThread t2 = new DeadlockInmainThread();
		t1.start();
		t2.start();
	}
	public void run(){
		for(int i=0;i<=5;i++){
			try{
				//System.out.println("entering in to deadlock");
				System.out.println(Thread.currentThread().getName()+ " " + i);
				System.out.println("hello");
				System.out.println("hi");
				System.out.println("hi");
				//Thread.currentThread().join();  //Telling the main thread to wait fro itself which is deadlock
				//System.out.println("this statement will never execute");
			}
			catch (Exception e) {
				e.printStackTrace(); 
			}
		}
	}
}
