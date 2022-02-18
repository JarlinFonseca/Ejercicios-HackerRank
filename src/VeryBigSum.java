
import java.util.*;


public class VeryBigSum{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cantidadNum = sc.nextInt();
        long vector[] = new long[cantidadNum];
        
        for (int i = 0; i <vector.length; i++) {
            vector[i]= sc.nextLong();
        }
        
        System.out.println(sumarVector(vector));
        
    }
    
    
    
      public static long sumarVector(long V[]){
        
        long sum=0;
        for (int i = 0; i <V.length; i++) {
            sum+=V[i];
        }
        return sum;
    
    }
    
    
}
