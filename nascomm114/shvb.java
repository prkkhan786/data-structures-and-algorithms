package nascomm114;

import java.lang.Thread.State;

public class shvb {

	public static void main(String[] args){
		Threadings t1 = new Threadings();
		t1.start();
		t1.join();
		if(t1.getState() == Thread.State.TERMINATED){
			
		}
		}	
	public void run(){
		Thread s = Thread.currentThread();
		System.out.println(s.getName());
		s.getState();
		
	}
	
	
}
