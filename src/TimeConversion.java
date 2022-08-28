
import java.util.Scanner;

/**
 *
 * @author Jarlin Fonseca
 */
public class TimeConversion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hora = sc.next();
        int bandera = getAM_PM(hora);
        
        System.out.println(getHoraFormato(hora, bandera));  
    }
    
    public static int getAM_PM(String hora){
        int banderaHora = 0;
        if(hora.indexOf("AM")>=0) banderaHora = 1;
        return banderaHora;
    }
    
    public static String getHoraFormato(String hora, int bandera){
        String resultHora = "";
             int num = getNumeroHora(hora);
        if(bandera == 1){
            if(num == 12){
                num-=12;
                resultHora+= num+"0"+hora.substring(2,hora.length()-2);
            }else 
             resultHora+=hora.substring(0,hora.length()-2);
        }else{
            if(num == 12){
                resultHora+=hora.substring(0,hora.length()-2);
            }else{
                num+=12;
                resultHora+= num+hora.substring(2,hora.length()-2);
            }
        }
        return resultHora;
    }
    
    public static int getNumeroHora(String hora){
        String h = hora.substring(0,2);
        if(h.substring(0,1).equals("0")){
            h = hora.substring(1,2);
        }
        
        int horaE = Integer.parseInt(h);
        return horaE;
    }
    
}
