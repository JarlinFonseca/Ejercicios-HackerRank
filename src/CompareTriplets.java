
import java.util.*;

public class CompareTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A[] = new int[3];
        int B[] = new int[3];
        
        for (int i = 0; i <A.length; i++) {
            A[i] = sc.nextInt();
            
        }
        
        for (int j = 0; j < B.length; j++) {
            B[j] = sc.nextInt();
        }
        int contadorAlice=0, contadorBob= 0;
        
        
        for (int i = 0; i < 3; i++) {
           if (A[i] > B[i]) contadorAlice++;
           else if(A[i] < B[i]) contadorBob++;
        }
        
        System.out.println(contadorAlice+" "+contadorBob);
    }
    
}
