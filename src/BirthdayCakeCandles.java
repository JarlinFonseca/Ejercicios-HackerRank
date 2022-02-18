
import java.util.*;

public class BirthdayCakeCandles{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int candles[] = new int[n];

        for (int i = 0; i < candles.length; i++) {
            candles[i] = sc.nextInt();
        }

        int maxHight = getMayorNum(candles);

        System.out.println(contarVelasAltas(candles, maxHight));

    }

    public static int getMayorNum(int V[]) {
        int mayor = V[0];
        for (int i = 0; i < V.length; i++) {

            if (V[i] > mayor) {
                mayor = V[i];
            }

        }
        return mayor;
    }

    public static int contarVelasAltas(int V[], int numMax) {
        int contador = 0;
        for (int i = 0; i < V.length; i++) {
            if (V[i] == numMax) {
                contador++;
            }

        }
        return contador;

    }

}
