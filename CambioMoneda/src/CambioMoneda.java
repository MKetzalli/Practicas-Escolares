//importacion de paqueterias
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

//se declara la clase
public class CambioMoneda{
    public static void main(String args[]){
        //el tipo de cambio sera usando de base el dia 09/05/2019
        //declaracion de variables
        float pesos=0;
        int opcion=0,menu=0;
        String mx="MX",moneda="";
        //establecer escaner para el ingreso de usuario
        Scanner ingreso=new Scanner(System.in);
        //do while para que las instrucciones se ejecuten al menos 1 vez, de forma que si el usuario desea salir o repetir se le de la opcion
        do{
            //solicitar cantidad de pesos
            System.out.println("ingrese cantidad en pesos");
            pesos=ingreso.nextFloat();
            System.out.println("cantidad ingresada: "+pesos+" "+mx);
            //seleccionar tipo de cambio
            System.out.println("seleccione moneda de cambio: \n1)dolares\n2)euros\n3)yenes\n4)libras");
            opcion=ingreso.nextInt();
            switch(opcion){
                case 1:
                    moneda="USD";
                    //acceso al metodo
                    Dolares(pesos,moneda);
                break;
                case 2:
                    moneda="€";
                    Euros(pesos,moneda);
                break;
                case 3:
                    moneda="JPY";
                    Yenes(pesos,moneda);
                break;
                case 4:
                    moneda="GBP";
                    Libras(pesos,moneda);
                break;
                default:
                    System.out.println("opcion invalida");
                break;
            }
            System.out.println("presione 1 para regresar \npresione 2 para salir");
            menu=ingreso.nextInt();
            //final del do while donde el usuario registra si desea salir o repetir
        }while(menu==1);
        System.out.println("hasta pronto");
    }
    
    //metodo dolares
    public static void Dolares(float pesos,String moneda){
        double dolar=0;
        dolar=pesos/19.30;
        //redondear los decimales tras el cambio de moneda
        double redondeado=new BigDecimal(dolar).setScale(2,RoundingMode.HALF_EVEN).doubleValue();
        System.out.println("su cambio a dolar es: "+redondeado);
        return;
        //regresa al proceso principal para verificar si se requiere repetir el proceso o salir
    }
    //metodo euros
    public static void Euros(float pesos,String moneda){
        double euro=0;
        euro=pesos/21.67;
        double redondeado=new BigDecimal(euro).setScale(2,RoundingMode.HALF_EVEN).doubleValue();
        System.out.println("su cambio a euros es: "+redondeado);
        return;
    }
    //metodo yenes
    public static void Yenes(float pesos,String moneda){
        double yen=0;
        yen=pesos/0.18;
        double redondeado=new BigDecimal(yen).setScale(2,RoundingMode.HALF_EVEN).doubleValue();
        System.out.println("su cambio a yenes es: "+redondeado);
        return;
    }
    //metodo libras
    public static void Libras(float pesos,String moneda){
        double libra=0;
        libra=pesos/25.08;
        double redondeado=new BigDecimal(libra).setScale(2,RoundingMode.HALF_EVEN).doubleValue();
        System.out.println("su cambio a libras es: "+redondeado);
        return;
    }
    
}