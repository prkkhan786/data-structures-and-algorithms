package Own;

public class Armstrong {

	
	public static void main(String[] args) 
	{
		
		//armstrongtilln(1, 999);
		armstrong(555);
//		int num,rem,limit=1000, sum = 0;
//		
//		for (int i = 1; i <= limit; i++)
//		{
//			num = i;
//			while (num > 0)
//			{
//				rem = num % 10;
//				sum = sum + (rem*rem*rem);
//				num = num / 10;
//			}
//	 
//			if (sum == i)
//			{
//				System.out.print(i + " ");
//			}
//			sum = 0;
//		}

	}
	
	
	public static void armstrongtilln(int sr,int er){
        int sum=0;
        for(int i=sr;i<=er;i++){
            int num = i;
            
            while(num>0){
                int rem = num % 10;
                sum = sum + (rem * rem * rem );
                num = num / 10 ;
                
            }
            if(sum == i){
                System.out.print(sum);
                System.out.print(" ");
            }
           sum = 0;
            
        }
    }
	
	 public static void armstrong(int num){
	        int temp = num;
	        int sum =0;
	        while(num!=0){
	            int rem = num % 10;
	            sum = sum + (rem * rem * rem);
	             num = num / 10;
	            
	        }
	        if(sum == temp){
	            System.out.println("true");
	        }
	        else{
	             System.out.println("false");
	        }
	    }

	

}
