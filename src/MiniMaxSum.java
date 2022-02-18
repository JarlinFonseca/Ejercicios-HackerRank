
import java.util.*;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long vector[] = new long[5];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextLong();
        }
        getVectorOdernado(vector);

        System.out.println(getMinSum(vector) + " " + getMaxSum(vector));

    }

    public static void getVectorOdernado(long vector[]) {
        Arrays.sort(vector);
    }

    public static long getMinSum(long V[]) {
        long sum = 0;
        for (int i = 0; i < V.length - 1; i++) {
            sum += V[i];
        }
        return sum;
    }

    public static long getMaxSum(long V[]) {
        long sum = 0;
        for (int i = 1; i < V.length; i++) {
            sum += V[i];
        }
        return sum;
    }

}
