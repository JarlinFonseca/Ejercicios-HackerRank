
import java.util.*;

public class StairCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int contador = i + 1;
            int contadorEspacios = n-1 - i;
            while (contadorEspacios > 0) {

                System.out.print(" ");
                contadorEspacios--;

            }
            while (contador > 0) {

                System.out.print("#");
                contador--;
            }
            System.out.println("");

        }
       
    }

}
