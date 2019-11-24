package nascomm114;

public class Mythread extends Thread{
		public void run(){
			boolean flag = false;
			for(int i = 0;i<=10;i++){
				System.out.println("thread");
				if(flag)
					return;
			}
			
		}
	
	
	public class Threaddemo{
		
		public void main(String args[]){
			Mythread m1 = new Mythread();
			Thread t1 = new Thread(m1);
			t1.start();
			System.out.println(Mythread.currentThread());
		 
		}
	}
}
