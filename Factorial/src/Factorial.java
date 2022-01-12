//importacion de paqueterias
import java.util.Scanner;
import java.math.BigInteger;
//declarar clase
public class Factorial{
    public static void main(String args[]){
        //definir escanner y variables
        Scanner ingreso=new Scanner(System.in);
        int num1,num2;
        //solicitud de datos al usuario
        System.out.println("nota: no se recomiendan numeros arriba del 20");
        System.out.println("ingrese limite inferior");
        num1=ingreso.nextInt();
        System.out.println("ingrese limite superior");
        num2=ingreso.nextInt();
        //verificar si entran en rango definido
        if(num1>0&&num1<50){
            if(num2>0&&num2<50){
              //ingresar a metodo los valores obtenidos por usuario
              Arreglo(num1,num2);  
            }else{
                System.out.println("limite superior invalido");
            }
        }else{
            System.out.println("limite inferior invalido");
        }
    }
    
    //metodo sin retorno
    public static void Arreglo(int num1,int num2){
        //definir arreglo bidimensional y variables
        long arr[][]=new long [num2][num2];
        int y=0,x=0,z=1;
        long i=1,suma=0;
        //realizar operaciones para rellenar el arreglo bidimensional
        do{
            //rellenar columnas del arreglo bidimensional
            do{
                i=i*z;
                arr[x][y]=i;
                z++;
                x++;
            }while(x<num1);
            //cambiar de fila en arreglo bidimensional
            System.out.println("el factorial de "+num1+" es: "+i);
            //realizar suma de factoriales obtenidos
            suma=i+suma;
            x=0;
            y++;
            z=1;
            i=1;
            num1++;
        }while(y<num2);
        //imprimir suma
        System.out.println("suma de factoriales es: "+suma);
    }
}