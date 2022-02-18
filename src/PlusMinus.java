
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int vectorNum[] = new int[n];

        for (int i = 0; i < vectorNum.length; i++) {
            vectorNum[i] = sc.nextInt();
        }

        getPlusMinus(vectorNum);

    }

    public static void getPlusMinus(int vector[]) {
        int contaPositivos = 0, contaNegativos = 0, contaCeros = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                contaPositivos++;
            } else if (vector[i] < 0) {
                contaNegativos++;
            } else {
                contaCeros++;
            }
        }

        int tamanioVector = vector.length;

        double operacionPositivos = (contaPositivos / (double) tamanioVector);
        double operacionNegativos = (contaNegativos / (double) tamanioVector);
        double operacionCeros = (contaCeros / (double) tamanioVector);

        System.out.println(String.format("%.6f", operacionPositivos));
        System.out.println(String.format("%.6f", operacionNegativos));
        System.out.println(String.format("%.6f", operacionCeros));

    }

}
