
import java.util.*;


public class DiagonalDifference {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tamanioMatriz = sc.nextInt();
        
        int matriz[][]= new int [tamanioMatriz][tamanioMatriz];
        
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
                
            }
        }
        
        int sumaDP = hallarSumaDiagonalPrincipal(matriz);
        int sumaDS = hallarSumaDiagonalSecundaria(matriz);
        
        int result = Math.abs(sumaDP-sumaDS);
        
        System.out.println(result);
        
        
    }
    
    
    public static int hallarSumaDiagonalPrincipal(int M[][]){
        int sumDiagoonalP=0;
        for (int i = 0; i < M.length; i++) {
                   sumDiagoonalP+=M[i][i];                     
        }
        
        return sumDiagoonalP;
    }
    
       public static int hallarSumaDiagonalSecundaria(int M[][]){
        int sumDiagoonalS=0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                
                if(i+j == M.length-1) sumDiagoonalS+=M[i][j]; 
            } 
        }    
        return sumDiagoonalS;
    }
}
