import java.util.Scanner;

public class SumtillN {

    public static void main(String[] args) {
        
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int nstar = 1;
        int space = n/2;
        int val=1;
        int r=1;
        while(r<=n){
        
            for(int cspace=1;cspace>=space;cspace++){
                System.out.println(" ");
                
            }
            if(r<=n/2){
                space--;
            }
            else{
                space--;
            }
            val = r<=n/2? r:n+1-r;
            for(int v=1;v<=nstar;v++){
                System.out.println(val + " ");
                val = v<=nstar/2?val+1:val-1;
            }
            
            if(r<=n/2){
                nstar+=2;
                }
            else{
                nstar-=2;
            }
            System.out.println();
            r++;
        }
        
    }
}