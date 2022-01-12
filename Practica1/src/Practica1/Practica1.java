/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;
import java.util.Scanner;
/**
 *
 * @author MKetzalli
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1,num2,resultado;
        System.out.println("println imprime texto y salta linea");
        System.out.print("print imprime texto sin saltar linea\n");
        System.out.printf( "%s\n%s\n","el porcentaje s indica que es cadena", "tras un salto, otra cadena y salto" );
        System.out.println("ahora vamos a proceder a realizar operaciones");
        System.out.println("ingrese primer numero:");
        num1=in.nextInt();
        System.out.println("ingrese segundo numero:");
        num2=in.nextInt();
        resultado=num1+num2;
        System.out.printf("resultado de suma es: %d\n",resultado);
        resultado=num1-num2;
        System.out.printf("resultado de resta es: %d\n",resultado);
        resultado=num1*num2;
        System.out.printf("resultado de multiplicacion es: %d\n",resultado);
        resultado=num1/num2;
        System.out.printf("resultado de division es: %d\n",resultado);
        resultado=num1%num2;
        System.out.printf("resultado de residuo es: %d\n",resultado);
    }
    
}
